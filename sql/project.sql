USE master;
DROP DATABASE shop;

CREATE DATABASE shop;

USE shop;

CREATE TABLE ClientAddresses(
  ID INT IDENTITY PRIMARY KEY,
  Country nvarchar(64) NOT NULL,
  City nvarchar(256) NOT NULL,
  Street nvarchar(256) NOT NULL,
  ClientID INT NOT NULL
);

CREATE TABLE Clients(
  ID INT IDENTITY PRIMARY KEY,
  PrimaryAddressId INT FOREIGN KEY REFERENCES ClientAddresses(ID),
  Email nvarchar(64) NOT NULL,
  PasswordHash varchar(64) NOT NULL,
  FirstName nvarchar(64) NOT NULL,
  LastName nvarchar(64) NOT NULL,
  IsBanned BIT NOT NULL DEFAULT 'FALSE'
);

ALTER TABLE ClientAddresses
ADD FOREIGN KEY (ClientID) REFERENCES Clients(ID);

INSERT INTO Clients (Email, PasswordHash, FirstName, LastName)
VALUES ('vanko@abv.bg', '688787d8ff144c502c7f5cffaafe2cc588d86079f9de88304c26b0cb99ce91c6', 'Ivan', 'Nedelchev'),
  ('vanka@abv.bg', 'd70248b5d7370271ea6fc490ce66cb358d45e7a921ee5219af9963a4a9b93034', 'Ivanka', 'Nedelcheva');

INSERT INTO ClientAddresses (Country, City, Street, ClientID)
VALUES ('Bulgaria', 'Plovdiv', 'bul. Hristo Botev 114', 1),
  ('Bulgaria', 'Plovdiv', 'bul. Bulgaria 63', 1),
  ('Bulgaria', 'Plovdiv', 'bul. Hristo Botev 114', 2);

UPDATE Clients
SET PrimaryAddressId = (
	SELECT Id
	FROM ClientAddresses
	WHERE ClientID = 1 AND Street = 'bul. Hristo Botev 114'
)
WHERE Email = 'vanko@abv.bg';

CREATE TABLE Categories(
  ID INT IDENTITY PRIMARY KEY,
  Name nvarchar(64) NOT NULL,
  ParentCategoryID INT FOREIGN KEY REFERENCES Categories(ID)
);

INSERT INTO Categories (Name)
VALUES ('Computers'), ('Laptops'), ('Phones');

DECLARE @ComputersID AS INT
SELECT @ComputersID = ID
	FROM Categories
	WHERE Name = 'Computers';

DECLARE @LaptopsID AS INT
SELECT @LaptopsID = ID
	FROM Categories
	WHERE Name = 'Laptops';

UPDATE Categories
SET ParentCategoryID = @ComputersID
WHERE ID = @LaptopsID;

CREATE TABLE CategoryCharacteristics(
  ID INT IDENTITY PRIMARY KEY,
  Name nvarchar(64) NOT NULL,
  CategoryID INT NOT NULL FOREIGN KEY REFERENCES Categories(ID)
);

CREATE TABLE Products(
  ID INT IDENTITY PRIMARY KEY,
  Name nvarchar(64) NOT NULL,
  CategoryID INT NOT NULL FOREIGN KEY REFERENCES Categories(ID),
  DeliveryPrice MONEY NOT NULL,
  ListPrice MONEY NOT NULL
);

DECLARE @LaptopsID AS INT
SELECT @LaptopsID = ID
	FROM Categories
	WHERE Name = 'Laptops';

INSERT INTO Products (Name, CategoryID, DeliveryPrice, ListPrice)
VALUES ('MacBook Pro', @LaptopsID, 1500, 3000);

CREATE TABLE ProductCharacteristics(
  ID INT IDENTITY PRIMARY KEY,
  ProductID INT NOT NULL FOREIGN KEY REFERENCES Products(ID),
  CharacteristicID INT NOT NULL FOREIGN KEY REFERENCES CategoryCharacteristics(ID),
  Value nvarchar(64) NOT NULL
);

INSERT INTO CategoryCharacteristics(Name, CategoryID)
VALUES ('Processor', @ComputersID),
	('Manufacturer', @ComputersID),
	('Screen Size', @LaptopsID);

SELECT * FROM CategoryCharacteristics;

DROP TABLE ProductsPriceHistory;

CREATE TABLE ProductsPriceHistory(
  ID INT IDENTITY PRIMARY KEY,
  ProductID INT NOT NULL FOREIGN KEY REFERENCES Products(ID),
  Date DATE NOT NULL DEFAULT GETDATE(),
  DeliveryPrice MONEY NOT NULL,
  ListPrice MONEY NOT NULL
);

-- TODO: Create trigger

CREATE TABLE OrderStatuses(
  ID INT IDENTITY PRIMARY KEY,
  Status varchar(32) NOT NULL
);

INSERT INTO OrderStatuses (Status)
VALUES ('Unpaid'), ('Paid'), ('Prepared'), ('Sent'), ('Delivered');

CREATE TABLE Orders(
  ID INT IDENTITY PRIMARY KEY,
  DATETIME DATETIME NOT NULL DEFAULT GETDATE(),
  StatusID INT NOT NULL FOREIGN KEY REFERENCES OrderStatuses(ID),
  ClientID INT NOT NULL FOREIGN KEY REFERENCES Clients(ID)
);

CREATE TABLE OrderProducts(
  ID INT IDENTITY PRIMARY KEY,
  OrderID INT NOT NULL FOREIGN KEY REFERENCES Orders(ID),
  ProductID INT NOT NULL FOREIGN KEY REFERENCES Products(ID)
);

CREATE TABLE OrderProductsCharacteristics(
  ID INT IDENTITY PRIMARY KEY,
  OrderProductID INT NOT NULL FOREIGN KEY REFERENCES OrderProducts(ID),
  ProductCharacteristicsID INT NOT NULL FOREIGN KEY REFERENCES ProductCharacteristics(ID)
);

DROP TYPE ProductsCharacteristicsArray;
DROP TYPE ProductsArray;

CREATE TYPE ProductsCharacteristicsArray
	AS TABLE(
		ProductsArrayID INT NOT NULL,
		-- This would be a foreign key
		ProductCharacteristicsID INT NOT NULL
	);

CREATE TYPE ProductsArray
	AS TABLE(
		ID INT IDENTITY PRIMARY KEY,
		ProductID INT NOT NULL
	);

DROP PROCEDURE CreateOrder;

CREATE PROCEDURE CreateOrder
(@ClientID INT, @ProductsArray ProductsArray READONLY, @ProductsCharacteristicsArray ProductsCharacteristicsArray READONLY)
AS
BEGIN
	INSERT INTO Orders (StatusID, ClientID)
	VALUES ((SELECT ID
	FROM OrderStatuses
	WHERE Status = 'Unpaid'), @ClientID);

	DECLARE @id INT = SCOPE_IDENTITY();

	-- https://stackoverflow.com/questions/18513986/how-to-write-a-foreach-in-sql-server
	DECLARE @minId INT = SELECT TOP 1 ID FROM @pa;
	WHILE(1 = 1)
	BEGIN
		INSERT INTO OrderProducts (OrderID, ProductID)
		VALUES (@id, )
		SELECT
			@id,
			ProductID
		FROM @ProductsArray;
	END
	
	INSERT INTO OrderProducts (OrderID, ProductID)
	SELECT
		@id,
		ProductID
	FROM @ProductsArray;

	INSERT INTO OrderProductsCharacteristics (OrderID, ProductCharacteristicsID)
	SELECT
		@id,
		pca.ProductCharacteristicsID
	FROM OrderProducts op, @ProductsCharacteristicsArray pca,
	WHERE op.OrderID = @id AND op.ProductID ;
END

DECLARE @cid INT = 1;

SELECT * FROM Orders;
SELECT * FROM OrderProducts;

DECLARE @pa ProductsArray;
INSERT INTO @pa (ProductID) VALUES (1);

DECLARE @pca ProductsCharacteristicsArray;

EXEC CreateOrder @cid, @pa, @pca;
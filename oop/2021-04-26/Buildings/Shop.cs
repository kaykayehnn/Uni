namespace Buildings
{
    public class Shop:IndustrialBuilding
    {
        public Shop(double quadrature, string address, string country, string companyName, int boxesCount) : base(quadrature, address, country, companyName)
        {
            BoxesCount = boxesCount;
        }
        
        public int BoxesCount { get; set; }
    }
}
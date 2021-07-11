using System;

namespace Telephone
{
  class Program
  {
    static void Main(string[] args)
    {

    }
  }

  class Telephone
  {
    public Telephone(string manufacturer, string model)
    {
      this.Manufacturer = manufacturer;
      this.Model = model;
    }

    public Telephone(string manufacturer, string model, double price) : this(manufacturer, model)
    {
      this.Price = price;
    }

    public double Price { get; set; }
    public string Manufacturer { get; set; }
    public string Model { get; set; }
  }
}

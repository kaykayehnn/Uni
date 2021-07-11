using System;

class Vehicle
{
  private const double DefaultFuelConsumption = 3;

  public Vehicle(int horsePowers, double fuel)
  {
    this.HorsePower = horsePowers;
    this.Fuel = fuel;
  }

  public virtual double FuelConsumption => DefaultFuelConsumption;

  public int HorsePower { get; set; }
  public double Fuel { get; set; }

  public virtual void Drive(double kilometers)
  {
    var usedFuel = kilometers / 100 * this.FuelConsumption;

    if (this.Fuel < usedFuel)
    {
      throw new Exception("Not enough fuel");
    }

    this.Fuel -= usedFuel;
  }
}
class SportCar : Car
{
    private const double DefaultFuelConsumption = 15;

    public SportCar(int horsePowers, double fuel) : base(horsePowers, fuel)
    {
    }

    public override double FuelConsumption => DefaultFuelConsumption;
}
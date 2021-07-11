class Car : Vehicle
{
    private const double DefaultFuelConsumption = 3;

    public Car(int horsePowers, double fuel) : base(horsePowers, fuel)
    {
    }

    public override double FuelConsumption => DefaultFuelConsumption;
}
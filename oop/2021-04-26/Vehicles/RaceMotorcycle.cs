class RaceMotorcycle : Motorcycle
{
    private const double DefaultFuelConsumption = 9;

    public RaceMotorcycle(int horsePowers, double fuel) : base(horsePowers, fuel)
    {
    }

    public override double FuelConsumption => DefaultFuelConsumption;
}
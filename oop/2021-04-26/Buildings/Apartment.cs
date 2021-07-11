namespace Buildings
{
    public class Apartment:LivingBuilding
    {
        public Apartment(double quadrature, string address, string country, double areaTerrace) : base(quadrature, address, country)
        {
            AreaTerrace = areaTerrace;
        }
        
        public double AreaTerrace { get; set; }
    }
}
namespace Buildings
{
    public class House:LivingBuilding
    {
        public House(double quadrature, string address, string country, double yard) : base(quadrature, address, country)
        {
            Yard = yard;
        }
        
        public double Yard { get; set; }
    }
}
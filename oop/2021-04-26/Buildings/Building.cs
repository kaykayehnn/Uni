namespace Buildings
{
    public class Building
    {
        public Building(double quadrature, string address, string country)
        {
            Quadrature = quadrature;
            Address = address;
            Country = country;
        }
        
        public double Quadrature { get; set; }
        public string Address { get; set; }
        public string Country { get; set; }
    }
}
namespace Buildings
{
    public class Warehouse:IndustrialBuilding
    {
        public Warehouse(double quadrature, string address, string country, string companyName, double capacity) : base(quadrature, address, country, companyName)
        {
            Capacity = capacity;
        }
        
        public double Capacity { get; set; }
    }
}
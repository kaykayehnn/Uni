namespace Buildings
{
    public class IndustrialBuilding:Building
    {
        public IndustrialBuilding(double quadrature, string address, string country, string companyName) : base(quadrature, address, country)
        {
            CompanyName = companyName;
        }
        
        public string CompanyName { get; set; }


    }
}
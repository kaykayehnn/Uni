namespace Buildings
{
    public class Office: IndustrialBuilding
    {
        public Office(double quadrature, string address, string country, string companyName, int employeeCount) : base(quadrature, address, country, companyName)
        {
            EmployeeCount = employeeCount;
        }
        
        public int EmployeeCount { get; set; }
    }
}
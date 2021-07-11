using System;

namespace oop_upr
{
  class Program
  {
    static void Main(string[] args)
    {
      int n = int.Parse(Console.ReadLine());
      for (int i = 0; i < n; i++)
      {
        string[] data = Console.ReadLine().Split(new[] { ',', ' ' }, StringSplitOptions.RemoveEmptyEntries);
        string manufacturer = data[0];
        string model = data[1];
        double ram = double.Parse(data[2]);
        string cpuManufacturer = data[3];
        double cpu = double.Parse(data[4]);
        double hardDrive = double.Parse(data[5]);

        Computer computer = new Computer(manufacturer, model, ram, cpuManufacturer, cpu, hardDrive);
        Console.WriteLine($"{computer.Manufacturer} - {computer.Model} - Performance: {computer.CalculatePerformance()}");
      }
    }
  }

  class Computer
  {
    public Computer(string manufacturer, string model, double ram, string cpuManufacturer, double cpu, double hardDrive)
    {
      this.Manufacturer = manufacturer;
      this.Model = model;
      this.RAM = ram;
      this.CPUManufacturer = cpuManufacturer;
      this.CPU = cpu;
      this.HardDrive = hardDrive;
    }

    public string Manufacturer { get; set; }
    public string Model { get; set; }
    public double RAM { get; set; }
    public string CPUManufacturer { get; set; }
    public double CPU { get; set; }
    public double HardDrive { get; set; }

    public double CalculatePerformance()
    {
      return RAM * CPU / 100;
    }
  }
}

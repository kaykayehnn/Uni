using System;

namespace Garden
{
  class Program
  {
    static void Main(string[] args)
    {
      Garden garden = new Garden();

      garden.Add("Banana");
      garden.Add("Apple");
      garden.Add("Apple");
      garden.Add("Apple");

      garden.Add("Apple");
      garden.Add("Apple");
      garden.Add("Apple");
      garden.Add("Apple");

      garden.Add("Apple");
      garden.Add("Apple");
      garden.Add("Apple");

      garden.Print();
    }
  }

  class Garden
  {
    private const int DEFAULT_LENGTH = 8;
    private string[] fruits;
    private int length;

    public Garden()
    {
      fruits = new string[DEFAULT_LENGTH];
      length = 0;
    }

    public void Add(string fruit)
    {
      if (length == fruits.Length)
      {
        string[] newFruits = new string[this.fruits.Length * 2];
        Array.Copy(this.fruits, newFruits, length);
        this.fruits = newFruits;
      }

      this.fruits[this.length++] = fruit;
    }

    public void Print()
    {
      for (int i = 0; i < this.length; i++)
      {
        Console.WriteLine(this.fruits[i]);
      }
    }
  }
}

using System;

namespace Animals
{
    public class Kitten: Cat
    {
        public Kitten(string name, int age) : base(name, age, "Female")
        {
        }
        
        public override void Say()
        {
            Console.WriteLine("Meeew");
        }
    }
}
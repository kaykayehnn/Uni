using System;

namespace Animals
{
    public class Dog : Animal
    {
        public Dog(string name, int age, string gender) : base(name, age, gender)
        {
        }

        public override void Say()
        {
            Console.WriteLine("Bark Bark!");
        }
    }
}
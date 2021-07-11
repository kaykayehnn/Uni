using System;

namespace Animals
{
    public class Tomcat: Cat
    {
        public Tomcat(string name, int age) : base(name, age, "Male")
        {
        }
        
        public override void Say()
        {
            Console.WriteLine("Mew");
        }
    }
}
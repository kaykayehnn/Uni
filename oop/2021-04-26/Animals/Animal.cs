using System;

namespace Animals
{
    public class Animal
    {
        public Animal(string name, int age, string gender)
        {
            Name = name;
            Age = age;
            Gender = gender;
        }
        
        public string Name { get; set; }
        public int Age { get; set; }
        public string Gender { get; set; }

        public virtual void Say()
        {
            throw new Exception();
        }
    }
}
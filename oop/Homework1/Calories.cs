using System;

namespace Homework1
{
    public class Calories
    {
        public static void EntryPoint()
        {
            int n = int.Parse(Console.ReadLine());

            var people = new Person[n];

            for (int i = 0; i < n; i++)
            {
                string[] data = Console.ReadLine()
                    .Split(new[] {',', ' '}, StringSplitOptions.RemoveEmptyEntries);

                string name = data[0];
                string gender = data[1];
                int age = int.Parse(data[2]);
                double height = double.Parse(data[3]);
                double weight = double.Parse(data[4]);
                double activityIndex = double.Parse(data[5]);

                people[i] = new Person(name, gender, age, height, weight, activityIndex);
            }

            Print(people);
        }

        static void Print(Person[] people)
        {
            for (int i = 0; i < people.Length; i++)
            {
                Console.WriteLine(people[i]);
            }
        }
    }
    
    class Person
    {
        public Person(string name, string gender, int age, double height, double weight, double activityIndex)
        {
            Name = name;
            Gender = gender;
            Age = age;
            Height = height;
            Weight = weight;
            ActivityIndex = activityIndex;
        }

        public string Name { get; set; }
        public string Gender { get; set; }
        public int Age { get; set; }
        public double Height { get; set; }
        public double Weight { get; set; }
        public double ActivityIndex { get; set; }

        public double CaloricBalance => 66.47 + (13.75 * Weight) + 5 * Height - 6.76 * Age;

        public override string ToString()
        {
            return $"{Name} – {Gender} – Caloric balance: {CaloricBalance}";
        }
    }
}
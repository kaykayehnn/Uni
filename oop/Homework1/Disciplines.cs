using System;
using System.Collections.Generic;
using System.Linq;

namespace Homework1
{
    public class Disciplines
    {
        public static void EntryPoint()
        {
            string input = Console.ReadLine();

            var students = new Dictionary<string, Student>();
            while (input != "end")
            {
                var data = input.Split(new[] {" => "}, StringSplitOptions.None);

                string discipline = data[0];
                string name = data[1];
                string facultyNumber = data[2];
                double grade = double.Parse(data[3]);

                if (!students.ContainsKey(name))
                {
                    var student = new Student(name, discipline, facultyNumber, grade);
                    students.Add(name, student);
                }
                
                input = Console.ReadLine();
            }

            var ordered = students
                .OrderByDescending(s => s.Value.Grade);

            foreach (var studentKvp in ordered)
            {
                Console.WriteLine(studentKvp.Value);
            }
        }
    }

    class Student
    {
        public Student(string name, string discipline, string facultyNumber, double grade)
        {
            Name = name;
            Discipline = discipline;
            FacultyNumber = facultyNumber;
            Grade = grade;
        }

        public string Name { get; set; }
        public string Discipline { get; set; }
        public string FacultyNumber { get; set; }
        public double Grade { get; set; }

        public override string ToString()
        {
            return $"{Name} {Discipline} {Grade}";
        }
    }
}

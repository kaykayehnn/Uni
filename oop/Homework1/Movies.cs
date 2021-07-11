using System;
using System.Linq;

namespace Homework1
{
    public class Movies
    {
        public static void EntryPoint()
        {
            int n = int.Parse(Console.ReadLine());
            var movies = new Movie[n];

            for (int i = 0; i < n; i++)
            {
                var data = Console.ReadLine().Split('#');
                string name = data[0];
                double rating = double.Parse(data[1]);

                movies[i] = new Movie(name, rating);
            }

            var ordered = movies
                .OrderByDescending(m => m.Rating)
                .ThenBy(m => m.Name);

            foreach (var movie in ordered)
            {
                Console.WriteLine(movie);
            }
        }
    }

    class Movie
    {
        public Movie(string name, double rating)
        {
            Name = name;
            Rating = rating;
        }
        
        public string Name { get; set; }
        public double Rating { get; set; }

        public override string ToString()
        {
            return $"{Name} - {Rating} stars";
        }
    }
}
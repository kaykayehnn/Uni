using System;
using System.Collections.Generic;
using System.Linq;

namespace OOP_20210405
{
  class Program
  {
    static void Main(string[] args)
    {
      // 1.

      // int[] numbers = new int[5];
      // for (int i = 0; i < numbers.Length; i++)
      // {
      //   numbers[i] = int.Parse(Console.ReadLine());
      // }

      // Array.Sort(numbers);

      // Console.WriteLine("Numbers:");
      // for (int i = numbers.Length - 1; i >= 0; i--)
      // {
      //   Console.WriteLine(numbers[i]);
      // }

      // 2.

      // var numbers = new List<int>(8);
      // for (int i = 0; i < 5; i++)
      // {
      //   numbers.Add(int.Parse(Console.ReadLine()));
      // }

      // int searched = int.Parse(Console.ReadLine());

      // if (numbers.Contains(searched))
      // {
      //   Console.WriteLine("match");
      // }
      // else
      // {
      //   Console.WriteLine("sorry");
      // }

      // string str = "php c# java php C# c# java php word word test".ToLower();
      // var words = str.Split(' ').OrderBy(w => w).ToList();

      // int i = 0;
      // while (i < words.Count)
      // {
      //   string current = words[i];
      //   int j;
      //   for (j = i + 1; j < words.Count; j++)
      //   {
      //     if (words[j] != current)
      //     {
      //       Console.WriteLine($"{current} - {j - i}");
      //       break;
      //     }
      //   }

      //   i = j;
      // }

      string input = Console.ReadLine();
      var dictionary = new Dictionary<string, int>();

      while (input != "end")
      {
        var data = input.Split(" ");
        string product = data[0];
        int quantity = int.Parse(data[1]);

        if (!dictionary.ContainsKey(product)) dictionary.Add(product, 0);

        dictionary[product] += quantity;
        input = Console.ReadLine();
      }

      var result = dictionary
          .OrderByDescending(kvp => kvp.Value);

      foreach (var kvp in result)
      {
        Console.WriteLine($"{kvp.Key} {kvp.Value}");
      }
    }
  }
}
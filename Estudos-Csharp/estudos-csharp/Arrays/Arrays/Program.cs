// See https://aka.ms/new-console-template for more information

int[] array1 = new int[4];
int[] array2 = new int[] { 1, 2, 3, 4 };
string[] array3 = new string[] { "a", "b", "c", "d" };

array1[0] = 1;
array1[1] = 2;
array1[2] = 3;
array1[3] = 4;

for (int i = 0; i < array1.Length; i++)
{
    Console.WriteLine(array1[i]);
}

foreach (int i in array2)
{
    Console.WriteLine(i);
}

foreach (string s in array3)
{
    Console.WriteLine(s);
}

/// <summary>
/// Representa uma pessoa com nome e idade
/// </summary>
public class Pessoa
{
    public string Nome { get; set; }
    public int Idade { get; set; }
}



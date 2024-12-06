using Interfaces.interfaces;
using Interfaces.Models;


ICalculadora calculadora = new Calculadora();
//instancia da classe Calculadora que implementa a interface ICalculadora 

Console.WriteLine(calculadora.Somar(10, 5));
Console.WriteLine(calculadora.Subtrair(10, 5));
Console.WriteLine(calculadora.Multiplicar(10, 5));
Console.WriteLine(calculadora.Dividir(10, 2));
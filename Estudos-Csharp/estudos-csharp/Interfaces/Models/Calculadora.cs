using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Interfaces.interfaces;

namespace Interfaces.Models
{
    public class Calculadora : ICalculadora
    {

        public int Subtrair(int a, int b)
        {
            return a - b;
        }
        public int Multiplicar(int a, int b)
        {
            return a * b;
        }
        public int Dividir(int a, int b)
        {
            try
            {
                return a / b;
            }
            catch (DivideByZeroException)
            {
                Console.WriteLine("Não é possível dividir por zero.");
                return 0;
            }
        }
    }
}

//como a interface ICalculadora tem um metodo com corpo, a implementação do metodo é opcional
//mas se a interface tiver um metodo sem corpo, a implementação do metodo é obrigatória
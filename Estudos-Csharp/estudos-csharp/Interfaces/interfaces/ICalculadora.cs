using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Interfaces.interfaces
{
    public interface ICalculadora
    {
        int Somar(int a, int b){   //metodo com corpo a implementação é opcional
            return a + b;
        }
        int Subtrair(int a, int b);
        int Multiplicar(int a, int b);
        int Dividir(int a, int b);
    }
}
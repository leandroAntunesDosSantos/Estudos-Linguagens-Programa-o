using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Polimorfismo.Models
{
    public class Professor : Pessoa
    {
        public decimal Salario { get; set; }

        public override void Apresentar()
        {
            Console.WriteLine($"Olá, eu sou {Nome} e tenho {Idade} anos e meu salário é {Salario}.");
        }
    }
}
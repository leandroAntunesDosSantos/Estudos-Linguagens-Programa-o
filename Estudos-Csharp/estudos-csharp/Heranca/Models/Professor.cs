using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Heranca.Models
{
    public class Professor : Pessoa
    {
        public decimal Salario { get; set; }    

        public sealed override void Apresentar()
    {
        Console.WriteLine($"Olá, meu nome é {Nome} e sou um professor.e ganho {Salario}");
    }

    }

}
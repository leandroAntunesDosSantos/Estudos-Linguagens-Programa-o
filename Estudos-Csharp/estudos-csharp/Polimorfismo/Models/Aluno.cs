using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Polimorfismo.Models
{
    public class Aluno : Pessoa
    {
        public int Nota { get; set; }

        public override void Apresentar()
        {
            System.Console.WriteLine($"Olá, eu sou {Nome} e tenho {Idade} anos e minha nota é {Nota}.");
        }
    }
}
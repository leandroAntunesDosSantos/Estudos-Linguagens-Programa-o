using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ClasseAbstrata.Models
{
    public class ContaCorrente : Conta
    {
        public ContaCorrente()
        {
        }
        public ContaCorrente(string nome) : base(nome) //chamando o construtor da classe pai semelhante ao super do java
        {
        }
        public override void Creditar(decimal valor)
        {
            Saldo += valor;
        }

        public override void Apresentar()
        {
            Console.WriteLine($"Ola {Nome} seu saldo é {Saldo} xD");
        }
    }
}



//sou obrigado a implementar o método Creditar
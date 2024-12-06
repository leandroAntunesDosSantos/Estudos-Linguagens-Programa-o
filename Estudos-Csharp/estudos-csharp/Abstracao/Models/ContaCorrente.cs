using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Abstracao.Models
{
    public class ContaCorrente
    {
        public ContaCorrente(int numeroConta, decimal saldoInicial)
        {
            NumeroConta = numeroConta;
            Saldo = saldoInicial;
        }
        public int NumeroConta { get; set; }

        private decimal Saldo { get; set; }

        private int Estrelas { get; set; }

        public void Sacar(decimal valor)
        {
            if (Saldo >= valor)
            {
                Saldo -= valor;
                System.Console.WriteLine($"Saque de {valor} efetuado com sucesso.");
                Estrelas++;
            }
            else
            {
                System.Console.WriteLine("Saldo insuficiente.");
            }
        }
        public void ExibirSaldo()
        {
            System.Console.WriteLine($"Saldo: {Saldo}");
            System.Console.WriteLine($"Estrelas: {Estrelas}");
        }
    }
}
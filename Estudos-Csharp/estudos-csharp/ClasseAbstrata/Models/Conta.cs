using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Threading.Tasks;

namespace ClasseAbstrata.Models
{
    public abstract class Conta
    {
        public Conta()
        {
        }
        public Conta(string nome)
        {
            Nome = nome;
        }
        
        public string Nome { get; set; }

        protected decimal Saldo { get; set; }

        public abstract void Creditar(decimal valor);

        public void ExibirSaldo()
        {
            Console.WriteLine($"Seu saldo é de: {Saldo}");
        }

        public virtual void Apresentar()
        {
            Console.WriteLine($"Seja bem vindo(a) {Nome} ao banco laranja");
        }

    }
}

//protected classes filhas podem alterar o comportamento do método Creditar
//metodo abstrato não tem corpo, não tem implementação
//private não pode ser acessado por classes filhas somente a classe pai pode alterar
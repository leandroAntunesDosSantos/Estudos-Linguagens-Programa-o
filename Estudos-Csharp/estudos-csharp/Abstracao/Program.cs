using System.Security.Cryptography;
using Abstracao.Models;


// Pessoa p1 = new Pessoa();
// p1.Nome = "João";
// p1.Idade = 30;
// p1.Apresentar(); 


ContaCorrente cc = new ContaCorrente(123, 1000);

cc.Sacar(100);
cc.Sacar(100);
cc.Sacar(100);

cc.ExibirSaldo();


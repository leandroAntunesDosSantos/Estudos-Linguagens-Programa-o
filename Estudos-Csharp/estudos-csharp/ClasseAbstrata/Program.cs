using ClasseAbstrata.Models;



ContaCorrente cc = new ContaCorrente("fernandinha");
cc.Creditar(100);
cc.Creditar(200);
cc.ExibirSaldo();
cc.Apresentar();
System.Console.WriteLine("=====================================");

ContaCorrente cc2 = new ContaCorrente();

cc2.Nome = "Marcela";

cc2.Creditar(500);
cc2.Creditar(200);
cc2.ExibirSaldo();
cc2.Apresentar();
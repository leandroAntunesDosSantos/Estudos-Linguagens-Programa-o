using InstalandoPacotes.Models;
using Newtonsoft.Json;

// criar um arquivo json e salvar no disco atraves de um objeto

// DateTime dataAtual = DateTime.Now;  //ISO 8601
//
// List<Venda> listaVendas = new List<Venda>();
//
// Venda v1 = new Venda(1, "Macarrao instantaneo", 10.5M, dataAtual);
// Venda v2 = new Venda(2, "Batata Frita", 20.5M, dataAtual);
//
// listaVendas.Add(v1);
// listaVendas.Add(v2);
//
// string serialized = JsonConvert.SerializeObject(listaVendas , Formatting.Indented);
//
// File.WriteAllText("Arquivos/venda.json", serialized);
//
// Console.WriteLine(serialized);


// ler o arquivo json e transformar em objeto

// string conteudo = File.ReadAllText("Arquivos/venda.json");
//
// List<Venda> listaVendas = JsonConvert.DeserializeObject<List<Venda>>(conteudo);
//
// foreach (Venda item in listaVendas)
// {
//     Console.WriteLine($"Id: {item.Id}");
//     Console.WriteLine($"Produto: {item.Produto}");
//     Console.WriteLine($"Preco: {item.Preco}");
//     Console.WriteLine($"Data Venda: {item.DataVenda}");
//     Console.WriteLine($"Desconto: {(item.Desconto.HasValue ? $"Desconto: {item.Desconto}" : "Sem desconto")}");
//     Console.WriteLine();
// }

// var tipoAnonimo = new
// {
//     Nome = "Leandro",
//     sobreNome = "Costa",
//     Altura = 1.75,
// };
//
// Console.WriteLine("Nome: " + tipoAnonimo.Nome);
// Console.WriteLine("Sobre Nome: " + tipoAnonimo.sobreNome);
// Console.WriteLine("Altura: " + tipoAnonimo.Altura);

// string conteudoArquivo = File.ReadAllText("Arquivos/venda.json");
//
// List<Venda> listaVendas = JsonConvert.DeserializeObject<List<Venda>>(conteudoArquivo);
//
// var listaAnonimo = listaVendas.Select(x => new { x.Produto, x.Preco });
//
// foreach (var item in listaAnonimo)
// {
//     Console.WriteLine($"Produto: {item.Produto}");
//     Console.WriteLine($"Preco: {item.Preco}");
//     Console.WriteLine();
// }


// dynamic variavelDinamica = "Leandro";
//
//
// Console.WriteLine(variavelDinamica.GetType());

//array de inteiros
// MeuArray<int> arrayInteiro = new MeuArray<int>();
//
// arrayInteiro.AdicionarElementoArray(30);
// arrayInteiro.AdicionarElementoArray(40);
//
// Console.WriteLine(arrayInteiro[0]);
// Console.WriteLine(arrayInteiro[1]);
//
// MeuArray<string> arrayString = new MeuArray<string>();
//
// arrayString.AdicionarElementoArray("Leandro");
// arrayString.AdicionarElementoArray("Santos");
//
// Console.WriteLine(arrayString[0]);
// Console.WriteLine(arrayString[1]);

int numero = 10;
bool par = false;


par = numero.IsPar();

string mensagem = "O número " + numero + " é " + (par ? "par" : "ímpar");
Console.WriteLine(mensagem);




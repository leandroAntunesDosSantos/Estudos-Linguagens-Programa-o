// See https://aka.ms/new-console-template for more information


using Classes.Model;

// Pessoa pessoa1 = new Pessoa();
//
// pessoa1.Nome = "Leandro";
// pessoa1.Idade = 30;
// pessoa1.Apresentar();


// string apresentacao = "olá meu conterrãneos, tudo certo?";
// int quantidade = 1;
// double altura = 1.80;
// decimal preco = 1.80M;
// bool condicao = true;
//
//
// Console.WriteLine(apresentacao);
// Console.WriteLine("Valor da variável quantidade: " + quantidade);
// Console.WriteLine("Valor da variável altura: " + altura.ToString("0.00")); //tratamento para exibir apenas 2 casas decimais
// Console.WriteLine("Valor da variável preco: " + preco);
// Console.WriteLine("Valor da variável condicao: " + condicao);

// DateTime dataAtual = DateTime.Now; //data da maquina
// DateTime dataAtualAddDias = dataAtual.AddDays(5); //adiciona 5 dias a data atual
// Console.WriteLine("Data atual: " + dataAtual);
// Console.WriteLine("Data atual + 5 dias: " + dataAtualAddDias);
// Console.WriteLine("Data atual + 5 dias: " + dataAtualAddDias.ToString("dd/MM/yyyy HH:mm")); //formatação da data


// int numero1 = 12;
//
// int numero2 = 34;
//
// int valorFinal = numero1 + numero2;
//
// valorFinal += 2;
//
// Console.WriteLine("O valor final é: " + valorFinal);


//converter string para int  [Cast = casting]

// int a = Convert.ToInt32("5");
// int b = int.Parse("5"); //se colocar algo que não é numero quebra o codigo exemplo: int b = int.Parse("5a");
//
// Console.WriteLine(a);
// Console.WriteLine(b);

// int inteiro = 5;
//
// string a = inteiro.ToString(); //converte inteiro para string  classeTo string tem em todos os tipos de variaveis
//
// Console.WriteLine(a);

// int a = 5;
//
// //double b = a; //converte inteiro para double  Cast Tipo implícito
// double b = Convert.ToDouble(a); //converte inteiro para double  Cast Tipo explícito
//
// long c = a; //converte inteiro para long  Cast Tipo implícito
//
// Console.WriteLine(b);
// Console.WriteLine(c);


// int quantidadeEmEstoque = 3;
//
// int quantidadeCompra = 4;
//
// bool possivelCompra = quantidadeEmEstoque >= quantidadeCompra;
//
// Console.WriteLine("Quantidade em estoque: " + quantidadeEmEstoque);
// Console.WriteLine("Quantidade da compra: " + quantidadeCompra);
// Console.WriteLine("É possível realizar a compra? " + possivelCompra);
//
// if (possivelCompra)
// {
//     Console.WriteLine("venda realizada com sucesso");
// }
// else
// {
//     Console.WriteLine("Quantidade insuficiente em estoque");
// }


// Console.WriteLine("digite uma letra: ");
// string letra = Console.ReadLine();
//
//
// switch (letra)
// {
//    case "a":
//       case "e":
//          case "i":
//             case "o":
//                case "u":
//                   Console.WriteLine("Vogal");
//                   break;
//    default:
//       Console.WriteLine("Consoante");
//       break;
// }

Calculadora calculadora = new Calculadora();
calculadora.Somar(3, 5);
calculadora.Subtrair(3, 5);
calculadora.Multiplicar(3, 5);
calculadora.Dividir(3, 5);
calculadora.Potencia(3, 4);
calculadora.Seno(30);
calculadora.Cosseno(30);
calculadora.Tangente(30);
calculadora.RaizQuadrada(81);

// int numero = 10;
//
// Console.WriteLine(numero);
//
// numero = numero + 1;
//
// Console.WriteLine(numero);
//
// numero += 1;
//
// Console.WriteLine(numero);
//
// numero++;
//
// Console.WriteLine(numero);
//
// numero--;
//
// Console.WriteLine(numero);





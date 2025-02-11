using Newtonsoft.Json;

namespace InstalandoPacotes.Models;

public class Venda
{
    public Venda(int id, string produto, decimal preco, DateTime dataVenda, decimal? desconto)
    {
        Id = id;
        Produto = produto;
        Preco = preco;
        DataVenda = dataVenda;
        Desconto = desconto;
    }

    public int Id { get; set; }

    [JsonProperty("Nome_Produto")]
    public string Produto { get; set; }

    public decimal Preco { get; set; }
    public DateTime DataVenda { get; set; }

    public decimal? Desconto { get; set; }  // ? indica que o valor pode ser nulo
}

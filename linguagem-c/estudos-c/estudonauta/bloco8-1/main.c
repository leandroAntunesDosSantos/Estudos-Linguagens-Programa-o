#include <stdio.h>



void main()
{
    char produto[20];
    float preco;
    float desconto;
    float precoFinal;

    printf("Produto: ");
    fgets(produto, 20, stdin);

    printf("Preço do produto ");
    scanf("%f", &preco);

    printf("Desconto: ");
    scanf("%f", &desconto);

    precoFinal = preco - (preco * (desconto / 100));

    printf("Nome do Produto: %s", produto);
    printf("Preco do produto: %.2f \n",preco);
    printf("Desconto de: %.2f %% \n", desconto);
    printf("Preco final: %.2f \n", precoFinal);
}

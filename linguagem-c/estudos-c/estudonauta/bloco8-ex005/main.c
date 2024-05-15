#include <stdio.h>

void main()
{
    char produto[10];
    float preco, valorFinal;
    int desconto;

    printf("Produto: ");
    scanf("%s", &produto);

    printf("Preco do %s: ", produto);
    scanf("%f", &preco);

    printf("Desconto: (%%)");
    scanf("%d", &desconto);

    valorFinal = preco - (preco * desconto / 100);

    printf("O produto %s custava R$%.2f, mas com %d%% de desconto, passa a custar R$%.2f. ", produto, preco, desconto, valorFinal);

}

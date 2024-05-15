#include <stdio.h>

void main()
{
    // int a = 6;
    // int b = 5;
    // int c = 6 < 5;
    // printf("%d", c);  //1 ou 0

    // int a=4, b=8;
    //
    // int c = (a>b)?b*2:a+5;
    // printf("%d", c);
    int numero;
    printf("Digite um numero qualquer: ");
    scanf("%d", &numero);

    printf("O número que você digitou é:%s\n", numero % 2 == 0 ? "Par": "Impar");
}

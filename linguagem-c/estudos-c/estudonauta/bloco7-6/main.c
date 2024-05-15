#include <stdio.h>

// void main()
// {
//    int numero;
//
//    printf("Digite um numero:");
//    scanf("%d", &numero);
//
//
//    printf("O numero é %s", numero % 2 ==0 ? "Par" : "Ímpar");
//
// }


// void main()
// {
//   printf("Ola, mundo\n");
//   printf("Ufa! já estou \"LIVRE\" da maldicao\n ");
//
// }

// void main()
// {
//   float numero;
//   printf("Digite um numero:");
//   scanf("%f", &numero);
//
//   printf("o dobro de %.2f é %.2f e a terça parte é %.2f", numero, numero * 2, numero / 3);
//
// }

void main()
{
    char letra;
    printf("Digite uma letra: ");
    //letra = getchar();
    scanf("%c", &letra);


    printf("Antes da letra %c temos a letra %c e depois temos a letra %c", letra, letra -1, letra + 1);

}
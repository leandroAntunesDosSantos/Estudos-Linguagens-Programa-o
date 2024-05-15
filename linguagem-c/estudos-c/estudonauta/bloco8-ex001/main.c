#include <stdio.h>

void main()
{
    int numero;

    printf("Digite um numero: \n");
    scanf("%d", &numero);

    printf("Analisando o numero %d o seu antecessor é o numero %d e o sucesor é o %d \n", numero, numero - 1, numero + 1);
}
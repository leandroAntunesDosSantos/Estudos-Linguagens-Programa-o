#include <stdio.h>

void main()
{
    int antecessor, numero, sucessor;
    printf("Digite um numero:");
    scanf("%d", &numero);

    antecessor = numero - 1;
    sucessor = numero + 1;

    printf("O numero %d tem com antecessor o numero %d e sucessor %d", numero, antecessor, sucessor);

}

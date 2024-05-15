#include <stdio.h>

void main()
{
    int numero;
    printf("Digite um numero: ");
    scanf("%d", &numero);

    printf("Analisando o numero %d o seu dobro é %d e a sua terça parte é %.2f \n", numero, numero * 2, (float)numero/3);

}

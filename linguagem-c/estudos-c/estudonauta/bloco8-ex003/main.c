#include <stdio.h>

void main()
{
    char letra;

    printf("Digite uma letra: ");
    scanf("%c", &letra);

    printf("Antes da letra %c temos a letra %c. Depois temos a letra %c \n", letra, letra - 1, letra + 1);
}

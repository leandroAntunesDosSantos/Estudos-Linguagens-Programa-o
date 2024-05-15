#include <stdio.h>


void main()
{
    float nota1,nota2,media;

    printf("Digite a primeira nota:");
    scanf("%f", &nota1);

    printf("Digite a segunda nota:");
    scanf("%f", &nota2);

    media = (nota1+nota2)/2;

    printf("Voce esta %s, sua nota foi %.2f \n ", media >= 70 ? "Aprovado":"Reprovado", media);

}

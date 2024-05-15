#include <stdio.h>

void main()
{
    float nota1, nota2;

    printf("Digite a primeira nota:");
    scanf("%f", &nota1);

    printf("Digite a segunda nota:");
    scanf("%f", &nota2);

    printf("A média do aluno foi %.2f \n", (nota1 + nota2)/2);
    printf("A sua situação é %s \n", (nota1 + nota2)/2 >= 70 ? "APROVADO":"REPROVADO");

}

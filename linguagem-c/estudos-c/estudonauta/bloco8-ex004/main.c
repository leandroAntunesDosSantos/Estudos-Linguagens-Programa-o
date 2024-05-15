#include <stdio.h>

void main()
{
    char nome[10];
    float nota1, nota2;
    printf("Digite o nome do aluno: ");
    scanf("%s", &nome);

    printf("Digite a primeira nota do aluno: ");
    scanf("%f", &nota1);

    printf("Digite a segunda nota do aluno: ");
    scanf("%f", &nota2);

    printf("O aluno %s tirou as notas %.2f e %.2f e sua media foi %.2f. \n", nome, nota1, nota2, (nota1 + nota2)/2);

}

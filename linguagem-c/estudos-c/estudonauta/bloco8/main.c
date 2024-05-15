#include <stdio.h>

void main()
{
    char nomeAluno[20];
    float nota1,nota2;

    printf("Digite o nome do aluno: ");
    fgets(nomeAluno, 20, stdin);

    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);

    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);

    printf("Nome do Aluno: %s \n", nomeAluno);
    printf("A media das notas foi %.2f \n", (nota1 + nota2)/2);


}

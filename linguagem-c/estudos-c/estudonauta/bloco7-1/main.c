#include <stdio.h>



// int main() {
//     void limparBuffer(void);
//     char a,b,c;
//
//     a = getchar();
//     limparBuffer();
//
//     b = getchar();
//     limparBuffer();
//
//     c = getchar();
//     limparBuffer();
//
//     printf("%c\n",a);
//     printf("%c\n",b);
//     printf("%c\n",c);
//
//     return 0;
// }

void limparBuffer(void) {
    char c;
    while ((c=getchar()) != '\n' && c != EOF);
}

// void main() {
//     srand(time(NULL));
//     int n = rand() % 50 + 1;
//     printf("Eu gerei o numero (%d)", n);
// }

void main() {
    void limparBuffer(void);

    char nome1[20], nome2[20], nome3[20];
    char sexo1,sexo2,sexo3;
    float nota1, nota2, nota3;

    printf("Cadastrando a primeira pessoa: \n");
    printf("-----------------------------\n");

    printf("NOME: ");
    scanf("%s", &nome1);
    limparBuffer();

    printf("SEXO [M/F] ");
    scanf("%c", &sexo1);
    limparBuffer();

    printf("NOTA: ");
    scanf("%f", &nota1);


    printf("Cadastrando a segunda pessoa: \n");
    printf("-----------------------------\n");
    fflush(stdin);

    printf("NOME: ");
    scanf("%s", &nome2);
    limparBuffer();

    printf("SEXO [M/F] ");
    scanf("%c", &sexo2);
    limparBuffer();

    printf("NOTA: ");
    scanf("%f", &nota2);

    printf("Cadastrando a terceira pessoa: \n");
    printf("-----------------------------\n");
    fflush(stdin);

    printf("NOME: ");
    scanf("%s", &nome3);
    limparBuffer();

    printf("SEXO [M/F] ");
    scanf("%c", &sexo3);
    limparBuffer();

    printf("NOTA: ");
    scanf("%f", &nota3);


    printf("\n\n  LISTAGEM COMPLETA\n");
    printf("\n-------------------------\n");
    printf("NOME               sexo   nota \n");


    printf("%-20s %c %6.1f\n",nome1, sexo1, nota1);
    printf("%-20s %c %6.1f\n",nome2, sexo2, nota2);
    printf("%-20s %c %6.1f\n",nome3, sexo3, nota3);

}


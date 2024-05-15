#include <stdio.h>
#include "math.h"

void ex01(){
    float custoEspetaculo, precoConvite;

    printf("Digite o custo do espetáculo: ");
    scanf("%f", &custoEspetaculo);

    printf("Digite o preço do convite: ");
    scanf("%f", &precoConvite);

    int qtdConvites = custoEspetaculo / precoConvite;

    printf("Quantidade de convites que devem ser vendidos: %d\n", qtdConvites);
}

void ex02(){
    int dias, horas, minutos, segundos;
    printf("Digite a quantidade de segundos: ");
    scanf("%d", &segundos);

    minutos = segundos / 60;
    horas = segundos/60/60;
    dias = segundos/60/60/24;

    printf("Segundos: %d\n", segundos);
    printf("Minutos: %d\n", minutos);
    printf("Horas: %d\n", horas);
    printf("Dias: %d\n", dias);

}

void ex03(){
    float degrau, altura, qtdDegraus;
    printf("Digite a altura da escada: ");
    scanf("%f", &altura);

    printf("Digite a altura de cada degrau: ");
    scanf("%f", &degrau);
    qtdDegraus = altura / degrau;

    printf("Quantidade de degraus: %.2f\n", qtdDegraus);
}

void ex04(){
    float altura, peso, imc;

    printf("Digite a altura(m): ");
    scanf("%f", &altura);

    printf("Digite o peso(Kg): ");
    scanf("%f", &peso);

    imc = peso / pow(altura, 2);

    printf("IMC: %.2f\n", imc);
}

void ex05(){
    float valorTotalBruto, valorTotalLiquido;
    float valorDiariaCheia, valorDiariaPromocao;
    int qtdApartamentosTotal;
    int porcentagemDescontoDiaria = 25;

    printf("Digite o valor da diaria: ");
    scanf("%f", &valorDiariaCheia);

    printf("Digite a quantidade de apartamentos total: ");
    scanf("%d", &qtdApartamentosTotal);

    valorTotalBruto = valorDiariaCheia * qtdApartamentosTotal;

    valorDiariaPromocao = valorDiariaCheia - (valorDiariaCheia * porcentagemDescontoDiaria / 100);

    valorTotalLiquido = valorDiariaPromocao * qtdApartamentosTotal;

    printf("\nO valor da diaria promocional: R$ %.2f \n", valorDiariaPromocao);
    printf("O total arrecadado com 100 %% de ocupacao: R$ %.2f\n", valorDiariaPromocao * qtdApartamentosTotal * 1.0);
    printf("O total arrecadado com 70 %% de ocupacao: R$ %.2f\n", valorDiariaPromocao * qtdApartamentosTotal * 0.7);
    printf("O valor que deixara de arrecadar ao aplicar o desconto: R$ %.2f\n", valorTotalBruto - valorTotalLiquido);

}

void ex06(){
    float aplicacao, taxaJuros, valorFinal;
    int meses;

    printf("Digite o valor da aplicação: ");
    scanf("%f", &aplicacao);

    printf("Digite a taxa de juros: ");
    scanf("%f", &taxaJuros);

    printf("Digite a quantidade de meses: ");
    scanf("%d", &meses);

    valorFinal = aplicacao * pow((1 + (taxaJuros/100)), meses);

    printf("Valor final: R$ %.2f\n", valorFinal);

}

int main() {

    int opcao = 0;

    printf("Digite o número do exercício que deseja executar: ");

    scanf("%d", &opcao);

    switch(opcao){
        case 1:
            ex01();
            break;
        case 2:
            ex02();
            break;
        case 3:
            ex03();
            break;
        case 4:
            ex04();
            break;
        case 5:
            ex05();
            break;
        case 6:
            ex06();
            break;
        default:
            printf("Opção inválida\n");
    }

    return 0;
}

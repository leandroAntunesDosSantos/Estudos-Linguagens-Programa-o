#include <stdio.h>
#include <math.h>

void ex01(){
    double salario, salarioReduzido;
    printf("Informe o valor do salario: ");
    scanf("%lf", &salario);

    salarioReduzido = floor(salario);

    printf("Salario informado: %.2lf\n", salario);
    printf("Reais: %.0lf\n", salarioReduzido);
    printf("Centavos: %.0lf\n", (salario - salarioReduzido) * 100);

}

void ex02(){
    double salarioInicial, percentualAumento, descontoTotal, salarioFinal;
    double salarioAumento, mostrarSalario;

    printf("Informe o valor do salario: R$ ");
    scanf("%lf", &salarioInicial);

    printf("Informe o percentual de aumento: (Ex: 10 para 10%%): ");
    scanf("%lf", &percentualAumento);

    printf("Informe o valor do desconto: (Ex: 5 para 5%%): ");
    scanf("%lf", &descontoTotal);

    salarioAumento = salarioInicial + (salarioInicial * (percentualAumento / 100));
    salarioFinal = salarioAumento - (salarioAumento * (descontoTotal / 100));

    mostrarSalario = floor(salarioFinal);

    printf("O salario liquido é de %.0lf reais e %.0lf centavos\n", mostrarSalario, (salarioFinal - mostrarSalario) * 100);

}

void ex03(){
    double numero;
    int milhar, centena, dezena, unidade;

    printf("Informe um numero com até 4 digitos: ");
    scanf("%lf", &numero);

    milhar = (int)(numero / 1000);
    centena = (int)(numero - (milhar * 1000)) / 100;
    dezena = (int)(numero - (milhar * 1000) - (centena * 100)) / 10;
    unidade = (int)(numero - (milhar * 1000) - (centena * 100) - (dezena * 10));

    printf("%d eh o primeiro digito\n", milhar);
    printf("%d eh o segundo digito\n", centena);
    printf("%d eh o terceiro digito\n", dezena);
    printf("%d eh o quarto digito\n", unidade);

}

void ex04(){
    double numero;
    int dezenaDeMilhar, milhar, centena, dezena, unidade, soma;

    printf("Informe um numero com até 5 digitos: ");
    scanf("%lf", &numero);

    dezenaDeMilhar = (int) (numero / 10000);
    milhar = (int)(numero - (dezenaDeMilhar * 10000)) / 1000;
    centena = (int)(numero - (dezenaDeMilhar * 10000) - (milhar * 1000)) / 100;
    dezena = (int)(numero - (dezenaDeMilhar * 10000) - (milhar * 1000) - (centena * 100)) / 10;
    unidade = (int)(numero - (dezenaDeMilhar * 10000) - (milhar * 1000) - (centena * 100) - (dezena * 10));

    soma = dezenaDeMilhar + milhar + centena + dezena + unidade;

    printf("%d eh o primeiro digito\n", dezenaDeMilhar);
    printf("%d eh o segundo digito\n", milhar);
    printf("%d eh o terceiro digito\n", centena);
    printf("%d eh o quarto digito\n", dezena);
    printf("%d eh o quinto digito\n\n", unidade);
    printf("A soma dos digitos eh: %d\n", soma);
}

void ex05(){
    double numero;
    int centena, dezena, unidade;

    printf("Informe um numero com ate tres digitos: ");
    scanf("%lf", &numero);

    centena = numero / 100;
    dezena = (numero - (centena * 100)) / 10;
    unidade = numero - (centena * 100) - (dezena * 10);

    printf("O inverso do numero eh: %d%d%d\n", unidade, dezena, centena);

}

int main() {
    int input;

    printf("Digite o numero do exercicio: ");
    scanf("%d", &input);

    switch (input) {
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
        default:
            printf("Numero invalido! ");
            break;
    }
}

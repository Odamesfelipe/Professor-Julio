import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Declarar variáveis
        double boleto1, boleto2, boleto3, boleto4, salarioBruto, salarioLiquido, totalDasContas, restanteSalario;

        // Criar um objeto Scanner para leitura de dados do usuário
        Scanner ler = new Scanner(System.in);

        // Solicitar o salário bruto
        System.out.println("Digite o seu salário bruto:");
        salarioBruto = ler.nextDouble();

        // Calcular o salário líquido (desconto de 14%)
        salarioLiquido = salarioBruto * (1 - 0.14);

        // Solicitar os valores dos boletos
        System.out.println("Digite o 1º boleto:");
        boleto1 = ler.nextDouble();

        System.out.println("Digite o 2º boleto:");
        boleto2 = ler.nextDouble();

        System.out.println("Digite o 3º boleto:");
        boleto3 = ler.nextDouble();

        System.out.println("Digite o 4º boleto:");
        boleto4 = ler.nextDouble();

        // Calcular o total das contas
        totalDasContas = boleto1 + boleto2 + boleto3 + boleto4;

        // Calcular o valor restante do salário após pagar os boletos
        restanteSalario = salarioLiquido - totalDasContas;

        // Exibir os resultados
        System.out.printf("Salário líquido após desconto de 14%%: R$ %.2f%n", salarioLiquido);
        System.out.printf("Total das contas: R$ %.2f%n", totalDasContas);
        System.out.printf("Restante do salário: R$ %.2f%n", restanteSalario);
    }
}
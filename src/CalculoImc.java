import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
    
        // Entrada Scanner 
        Scanner scanner = new Scanner(System.in);

        // Float entrada de dados
        Double altura;
        Double peso;
        Double imc_resultado; 

        // Pedir a altura do Usuario
        System.out.print("Informe sua altura: ");
        altura = scanner.nextDouble();

        // Pedor o Peso do usuario
        System.out.print("Informe seu peso: ");
        peso = scanner.nextDouble();

        //Processamento das informações 
        imc_resultado = peso / (altura * altura);

        //Resultado
        System.out.println("\nSeu IMC é: " + imc_resultado);

        //Tabela de informações IMC 
        System.out.printf("\nIMC <18,5kg/m2 - baixo peso \nIMC >18,5 até 24,9kg/m2 - eutrofia (peso adequado) \nIMC ≥25 até 29,9kg/m2 - sobrepeso. \nIMC >30,0kg/m2 até 34,9kg/m2 - obesidade grau 1.\n");

        scanner.close();
    }
}
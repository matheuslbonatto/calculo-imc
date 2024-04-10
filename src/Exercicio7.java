import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Quanto está valendo o dolar hoje?");
    double valorDolarHoje = scanner.nextDouble();

    System.out.println("Quanto você possui em dolares?");
    double valorEmEspecie = scanner.nextDouble();

    double valorConvertido = valorEmEspecie * valorDolarHoje;

    System.out.printf("O dolar hoje está valendo R$ %.2f. US$ %.2f equivalem a R$ %.2f ",
        valorDolarHoje,
        valorEmEspecie,
        valorConvertido);
  }
    
}

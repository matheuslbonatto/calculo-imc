import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // 1 - Obter os valores de A, B e C
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de A");
        int a = scanner.nextInt();
    
        System.out.println("Informe o valor de B");
        int b = scanner.nextInt();
    
        System.out.println("Informe o valor de C");
        int c = scanner.nextInt();
    
        // Calcular o valor da discriminante (delta) b² * 4 * a * c
        double delta = (b * b) - (4 * a * c);
        // Calcular o x1 (x`)
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        // Calcular o x2 (x``)
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("delta: " + delta);
        System.out.println("x1: " + x1 + " x2: " + x2);
    
        scanner.close();
      }

    
}

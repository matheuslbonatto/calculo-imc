public class Exercicio4 {
    public static void main(String[] args) {
        int largura = 12;
        int altura = 7;
        double area = largura * altura;
        double perimetro = 2 * (altura + largura);
        System.out.printf("A área do retangulo com largura %d e altura %d é: %f",
            largura, altura, area);
        System.out.printf("\nO Perimetro do retangulo com largura %d e altura %d é: %f",
            largura, altura, perimetro);
      }
}

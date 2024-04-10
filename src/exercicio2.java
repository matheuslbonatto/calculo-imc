public class exercicio2 {
    public static void main(String[] args) {
        // 2 - Declare duas variáveis do tipo double chamadas num1 e num2
        // e inicialize-as com quaisquer valores decimais.
        // Em seguida, calcule a soma, a diferença, o produto e
        // o quociente de num1 e num2 e imprima os resultados.
    
        // 1 - Declarar uma variável do tipo double chamada num1 e inicializar com
        // qualquer valor
        double num1 = 10;
        // 2 - Declarar uma variável do tipo double chamada num2 e inicializar com
        // qualquer valor
        double num2 = 3.2;
    
        // 3 - Calcule a soma de num1 + num2
        double soma = num1 + num2;
        System.out.printf("\nA soma de %.2f + %.2f é igual a: %.2f",
            num1, num2, soma);
        // 4 - Calcule a diferença de num1 - num2
        double diferenca = num1 - num2;
        System.out.printf("\nA diferença de %.2f - %.2f é igual a: %.2f",
            num1, num2, diferenca);
        // 5 - Calcule o produto de num1 * num2
        double produto = num1 * num2;
        System.out.printf("\nO produto de %.2f - %.2f é igual a: %.2f",
            num1, num2, produto);
        // 6 - Calcule o quociente de num1 / num2
        double quociente = num1 / num2;
        System.out.printf("\nO quociente de %.2f / %.2f é igual a: %.2f",
            num1, num2, quociente);
        // 7 - Imprima os resultados das operações
    
      }  
    
}

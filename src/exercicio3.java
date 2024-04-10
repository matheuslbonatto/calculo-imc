import java.util.Scanner;

public class exercicio3 {
    public static void main(string[] args){
 /*
     * 3 - Declare e inicialize uma variável do tipo String chamada name com seu
     * próprio nome. Em seguida, imprima uma mensagem que diga
     * "Olá, meu nome é [nome]", sequência declare outra variável, e através da
     * Classe Scanner, peço ao usuário para informar o sobrenome, e por fim imprima
     * o nome completo.
     */

    // 1 - Declarar uma variável do tipo String chamada name e inicializar com o meu
    // nome
    String name = "Cezar";
    // 2 - Imprima a mensagem "Olá, meu nome é [nome]" e troque o nome pelo valor de
    // name
    System.out.println("Olá, meu nome é " + name);
    // 3 - Declarar uma variável chamada sobrenome e inicializar com o scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu sobrenome completo: ");
    String sobrenome = scanner.nextLine();
    // 4 - Imprima o nome completo
    System.out.println(name + " " + sobrenome);
    System.out.printf("%s %s", name, sobrenome);
    scanner.close();

    }
}

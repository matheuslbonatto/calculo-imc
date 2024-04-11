import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
         // 0 - Todos os cálculos devem efetivamente ser armazenados em memória
    // 1 - Fazer a leitura da quantidade de votos válidos para cada candidato
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a quantidade de votos do candidato 1");
    int votosCandidato1 = scanner.nextInt();

    System.out.println("Informe a quantidade de votos do candidato 2");
    int votosCandidato2 = scanner.nextInt();

    System.out.println("Informe a quantidade de votos do candidato 3");
    int votosCandidato3 = scanner.nextInt();

    // 2 - Fazer a leitura da quantidade de votos nulos
    System.out.println("Informe a quantidade de votos nulos");
    int votosNulos = scanner.nextInt();

    // 3 - Fazer a leitura da quantidade de votos em branco.
    System.out.println("Informe a quantidade de votos em branco");
    int votosEmBranco = scanner.nextInt();

    // 4 - Apresentar o número total de eleitores, considerando votos válidos, nulos
    // e em branco;
    int votosValidos = votosCandidato1 + votosCandidato2 + votosCandidato3;
    int totalEleitores = votosValidos + votosNulos + votosEmBranco;

    // 5 - Apresentar o percentual correspondente de votos válidos em relação à
    // quantidade de eleitores;
    double percentualVotosValidos = votosValidos * 100 / totalEleitores;
    
    // 6 - Apresentar o percentual correspondente de votos válidos do candidato A em
    // relação à quantidade de eleitores;
    final double percentualVotosCandidato1 = votosCandidato1 * 100 / totalEleitores;
    
    // 7 - Apresentar o percentual correspondente de votos válidos do candidato B em
    // relação à quantidade de eleitores;
    final double percentualVotosCandidato2 = votosCandidato2 * 100 / totalEleitores;
    
    // 8 - Apresentar o percentual correspondente de votos válidos do candidato C em
    // relação à quantidade de eleitores;
    final double percentualVotosCandidato3 = votosCandidato3 * 100 / totalEleitores;
    
    // 9 - Apresentar o percentual correspondente de votos nulos em relação à
    // quantidade de eleitores;
    final double percentualVotosNulos = votosNulos * 100 / totalEleitores;

    // 10 - Ao final, apresentar o percentual correspondente de votos em branco em
    // relação à quantidade de eleitores.
    final double percentualVotosEmBranco = votosEmBranco * 100 / totalEleitores;

    System.out.println("Percentual votos validos: "           + percentualVotosValidos);
    System.out.println("Percentual de votos do candidato 1: " + percentualVotosCandidato1);
    System.out.println("Percentual de votos do candidato 2: " + percentualVotosCandidato2);
    System.out.println("Percentual de votos do candidato 3: " + percentualVotosCandidato3);
    System.out.println("Percentual de votos nulos: "          + percentualVotosNulos);
    System.out.println("Percentual de votos em branco: "      + percentualVotosEmBranco);

    scanner.close();
    }
    
}

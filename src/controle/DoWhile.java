package controle;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String texto = "por favor";

    do {
      System.out.println("Digite a palavra correta");
      texto = entrada.nextLine();
    } while (!texto.equalsIgnoreCase("sair"));

    System.out.println("Você saiu!");

    entrada.close();
  }
}

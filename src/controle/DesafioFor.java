package controle;

public class DesafioFor {
  public static void main(String[] args) {
    String valor = "@";
    for (int i = 1; i <= 5; i++) {
      System.out.println(valor);
      valor += "@";
    }

    // Versao do desafio
    // Não pode usar valor numerico para controlar o laço
    for (String j = "@"; !j.equals("@@@@@@"); j += "@") {
      System.out.println(j);
    }
  }
}

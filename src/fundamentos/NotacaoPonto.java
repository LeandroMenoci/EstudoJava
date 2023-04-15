package fundamentos;

public class NotacaoPonto {
  public static void main(String[] args) {
    // double a = 2.3;
    String s = "Um texto";
    s = s.replace("texto", "textinho");
    s = s.toUpperCase();
    s = s.concat("!!!!");

    System.out.println(s);

    String x = "Leandro".toUpperCase();
    System.out.println(x);

    String y = "Bom dia X"
        .replace("X", "Leo")
        .toUpperCase()
        .concat("!!!!");
    System.out.println(y);

    // Tipos primitivos nao tem o operador "."
    // int d = 3;

  }
}

package fundamentos;

public class TipoString {
  public static void main(String[] args) {
    System.out.println("Olá Pessoal".charAt(4));

    String s = "Bom dia";
    s = s.toUpperCase();
    // s = "Bom diia";
    System.out.println(s.concat("!!!"));
    System.out.println(s + "!!");
    System.out.println(s.startsWith("Bom")); // false
    System.out.println(s.toLowerCase().startsWith("bom")); // true
    System.out.println(s.length());

    var nome = "Pedro";
    var sobrenome = "Santos";
    var idade = 33;
    var salario = 12333.44;

    System.out.println("Nome: " + nome + "\nSobrenome" + sobrenome
        + "\nIdade: " + idade + "\nSalario" + salario + "\n\n");

    System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);

    String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
    System.out.println(frase);
  }
}

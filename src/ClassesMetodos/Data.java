package ClassesMetodos;

public class Data {
  int dia;
  int mes;
  int ano;

  // VALORES PADRÕES
  // byte, short, int, long -> 0
  // float, double -> 0.0
  // boolean -> false
  // char -> '\u0000'
  // Objetos (ex String) -> null
  // - Variáveis são inicializadas com valor padrão quando estão em uma instancia
  // ou classe, caso seja inicializada dentro de um método ou construtor (local) é
  // necessário
  // - definir seu valor.
  // - Constantes (final) é obrigatório definir um valor

  Data() {
    // dia = 1;
    // mes = 1;
    // ano = 1970;
    this(1, 1, 1970);
  }

  Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  String obterDataFormatada() {
    final String formato = "%d/%d/%d\n";
    return String.format(formato, dia, mes, ano);
  }

  // void imprimirDataFormatada() {
  // System.out.println(obterDataFormatada());
  // }
}

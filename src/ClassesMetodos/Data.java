package ClassesMetodos;

public class Data {
  int dia;
  int mes;
  int ano;

  Data() {
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  Data(int diaIncial, int mesInicial, int anoInicial) {
    dia = diaIncial;
    mes = mesInicial;
    ano = anoInicial;
  }

  String obterDataFormatada() {
    return String.format("%d/%d/%d\n", dia, mes, ano);
  }

  // void imprimirDataFormatada() {
  // System.out.println(obterDataFormatada());
  // }
}

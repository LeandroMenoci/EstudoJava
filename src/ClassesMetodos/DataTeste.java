package ClassesMetodos;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.dia = 7;
    d1.mes = 11;
    d1.ano = 2022;

    var d2 = new Data(31, 3, 2023);
    // d2.dia = 31;
    // d2.mes = 3;
    // d2.ano = 2023;

    Data d3 = new Data();

    String dataFormatada1 = d1.obterDataFormatada();

    System.out.println(dataFormatada1);
    System.out.println(d2.obterDataFormatada());
    System.out.println(d3.obterDataFormatada());
    // d1.imprimirDataFormatada();
  }
}

package fundamentos;

// import javax.swing.text.html.HTMLDocument.BlockElement;

public class TiposPrimitivos {
  public static void main(String[] args) {
    // Informações do funcionário

    // Tipos numéricos inteiros
    byte anosDeEmpresa = 23;
    short numeroDeVoos = 542;
    int id = 56320;
    long pontosAcumulados = 3_234_323_433L;

    // Tipos numéricos reais
    float salario = 11_443.44F;
    double vendasAcumuladas = 2_331_122_120.01;

    // Tipo booleano
    boolean estaDeFerias = false; // true

    // Tipo caractere
    char status = 'A'; // Ativo

    // Dias de empresa
    System.out.println(anosDeEmpresa * 365);

    // Números de viagens
    System.out.println(numeroDeVoos / 2);

    // Pontos por real
    System.out.println(pontosAcumulados / vendasAcumuladas);

    // Quanto ganha por id
    System.out.println(id + ": ganha -> " + salario);

    // Ferias
    System.out.println("Férias? " + estaDeFerias);

    // Status do usuário
    System.out.println(status);
  }
}

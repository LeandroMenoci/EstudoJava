package Collections;

import java.util.ArrayList;

public class Lista {
  public static void main(String[] args) {
    ArrayList<Usuario> lista = new ArrayList<>();

    Usuario u1 = new Usuario("Ana");
    lista.add(u1);
    lista.add(new Usuario("Carlos"));
    lista.add(new Usuario("Lia"));
    lista.add(new Usuario("Leandro"));
    lista.add(new Usuario("Roberto"));

    System.out.println(lista.get(3)); // acessar pelo indice
    lista.remove(4);
    lista.remove(new Usuario("Lia"));

    for (Usuario u : lista) {
      System.out.println(u);
    }
  }
}

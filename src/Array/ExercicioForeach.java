package Array;

import java.util.Arrays;

public class ExercicioForeach {
  public static void main(String[] args) {
    double[] notasAlunoA = new double[4];
    System.out.println(Arrays.toString(notasAlunoA));

    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;
    notasAlunoA[3] = 5.2;

    System.out.println(Arrays.toString(notasAlunoA));
    System.out.println(notasAlunoA[0]);
    System.out.println(notasAlunoA[notasAlunoA.length - 1]);
    // System.out.println(notasAlunoA[4]); ERRO!

    // double totalAlunoA = 0;
    // for (int i = 0; i < notasAlunoA.length; i++) {
    // totalAlunoA += notasAlunoA[i];
    // }

    // System.out.println(totalAlunoA / notasAlunoA.length);

    for (double notaA : notasAlunoA) {
      System.out.print(notaA + " ");
    }

    System.out.println();

    double[] notasAlunoB = { 6.9, 7.8, 8, 7 };
    // double totalAlunoB = 0;
    // for (int i = 0; i < notasAlunoB.length; i++) {
    // totalAlunoB += notasAlunoB[i];
    // }

    // System.out.println(totalAlunoB / notasAlunoB.length);

    for (double notaB : notasAlunoB) {
      System.out.print(notaB + " ");
    }
  }
}

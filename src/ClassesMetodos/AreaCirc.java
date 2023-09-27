package ClassesMetodos;

public class AreaCirc {
  double raio;
  static final double PI = 3.14;

  AreaCirc(double raioInicial) {
    raio = raioInicial;
  }

  double area() {
    // return pi * (raio * raio);
    return PI * Math.pow(raio, 2);
  }

  static double area(double raio) {
    return PI * Math.pow(raio, 2);
  }
}

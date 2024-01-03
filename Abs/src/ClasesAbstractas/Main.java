package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
        Figura circ = new Circulo(5);
        Figura rect = new Rectangulo(2, 3);

        System.out.println("El area del circulo es: " + circ.calcularArea());
        System.out.println("El perimetro del circulo es: " + circ.calcularPerimetro());
        circ.escribirMensaje();

        System.out.println("El area del rectangulo es: " + rect.calcularArea()
        System.out.println("El perimetro del rectangulo es: " + rect.calcularPerimetro());
        rect.escribirMensaje();
    }
}

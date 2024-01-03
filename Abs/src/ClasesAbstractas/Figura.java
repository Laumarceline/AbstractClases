package ClasesAbstractas;

abstract public class Figura {

    abstract public double calcularPerimetro();
    abstract public double calcularArea();

    public void escribirMensaje() {
        System.out.println("Hola, soy una figura geométrica");
    }
}

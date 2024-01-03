package ClasesAbstractas.Interfaces;

public class Circulo implements Figuras{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;

    @Override
    public double calcularPerimetro() {
        return 2*radio*Math.PI;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
}

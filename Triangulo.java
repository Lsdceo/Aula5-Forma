package Entidade;

public class Triangulo extends Forma {

    public Triangulo(double base, double altura) {
        super(base, base, altura, "Triangulo");
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }
}
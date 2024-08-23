package Entidade;

public class Retangulo extends Forma {

    public Retangulo(double largura, double altura) {
        super(largura, largura, altura, "Retangulo");
    }

    @Override
    public double calcularArea() {
        return getLargura() * getAltura();
    }
}

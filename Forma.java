package Entidade;

public class Forma {
    private double base;
    private double largura;
    private double altura;
    private String forma;

    public Forma(double base, double largura, double altura, String forma) {
        this.base = base;
        this.largura = largura;
        this.altura = altura;
        this.forma = forma;
    }

    public double getBase() {
        return base;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public String getForma() {
        return forma;
    }

    public double calcularArea() {
        return 0; // This method should be overridden in subclasses
    }
    
    public double mostrarInfo() {
    	return calcularArea();
    }
}
package Model;

public class Circulo {

    private int raio;
    private Ponto origem;

    public Circulo(int raio, Ponto origem) {
        this.raio = raio;
        this.origem = origem;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
    
}

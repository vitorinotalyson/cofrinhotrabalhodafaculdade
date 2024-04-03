package cofrinho;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("\nDólar = $ %.2f",valor);
    }

    @Override
    public double converter() {
        return valor * 5.0; // Supondo que 1 Dólar equivale a 5 Reais
    }
}

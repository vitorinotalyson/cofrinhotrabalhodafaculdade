package cofrinho;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("\nEuro = € %.2f",valor);
    }

    @Override
    public double converter() {
        return valor * 6.0; // Supondo que 1 Euro equivale a 6 Reais
    }
}

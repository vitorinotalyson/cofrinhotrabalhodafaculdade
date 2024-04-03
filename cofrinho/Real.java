package cofrinho;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("\nReal = R$ %.2f",valor);
    }
}

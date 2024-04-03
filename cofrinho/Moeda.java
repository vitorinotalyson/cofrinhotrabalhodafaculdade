package cofrinho;

abstract public class Moeda {

    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }
    public abstract void info();

    public void adicionarValor(double valorAdicional){
        valor += valorAdicional;
    }

    public void removerValor(double valorRemovido){
        valor -= valorRemovido;
    }



    public double converter() {
        return valor;
    }
}

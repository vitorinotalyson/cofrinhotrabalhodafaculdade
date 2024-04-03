package cofrinho;

import java.util.ArrayList;
import java.util.HashMap;

public class Cofrinho  {
    private HashMap<String, Moeda> cofrinho;
    public Cofrinho(){
        cofrinho = new HashMap<>();
        cofrinho.put("Dolar", new Dolar(0));
        cofrinho.put("Euro", new Euro(0));
        cofrinho.put("Real", new Real(0));
    }
    public void adicionarValor(String moeda, double valorAdicional){
        if (cofrinho.containsKey(moeda)){
            cofrinho.get(moeda).adicionarValor(valorAdicional);
            System.out.printf("Valor adicionado ao cofrinho: %.2f %s",
                    valorAdicional,moeda);
        }
        else {
            System.out.println("Moeda inválida");
        }
    }

    public void removerValor(String moeda, double valorRemovido) {
        if (cofrinho.containsKey(moeda)){
            cofrinho.get(moeda).removerValor(valorRemovido);
            System.out.printf("Valor removido do cofrinho: %.2f %s",
                    valorRemovido,moeda);
        }
        else {
            System.out.println("Moeda inválida");
        }
    }

    public void listagemMoedas(){
        System.out.println("Moedas no cofrinho: ");
        for (String moeda : cofrinho.keySet()){
            cofrinho.get(moeda).info();
        }
    }

    public double totalConvertido(){
       double total = 0.0;
       for (String moeda : cofrinho.keySet()) {
           total += cofrinho.get(moeda).converter();
       }
       return total;
    }
   
}

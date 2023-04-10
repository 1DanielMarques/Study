package org.example.core.solid.ocp.correct;

public class CalculaValorTotal {

    private Imposto imposto;

    public CalculaValorTotal(Imposto imposto) {
        this.imposto = imposto;
    }

    public void calcula() {
        imposto.calculaImposto();
    }

}

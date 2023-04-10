package org.example.core.solid.ocp.incorrect;

public class CalculaValorTotal {

    public void calcula() {
        int condicao = 0;
        if (condicao == 0) {
            var imposto = new IOF();
            imposto.calcula();
        } else if (condicao == 1) {
            var imposto = new IRPF();
            imposto.calcula();
        }
    }

}

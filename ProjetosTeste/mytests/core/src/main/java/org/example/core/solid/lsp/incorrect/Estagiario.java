package org.example.core.solid.lsp.incorrect;

public class Estagiario extends Funcionario {
    @Override
    void calculaDecimoTerceiro() {
        throw new RuntimeException();
    }
}

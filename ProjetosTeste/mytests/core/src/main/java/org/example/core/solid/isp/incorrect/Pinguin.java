package org.example.core.solid.isp.incorrect;

public class Pinguin implements Ave{
    @Override
    public void bicar() {

    }

    @Override
    public void voar() {
        throw new RuntimeException("Pinguin nao voa");
    }
}

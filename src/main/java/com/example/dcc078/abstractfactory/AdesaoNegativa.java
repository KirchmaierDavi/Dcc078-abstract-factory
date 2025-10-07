package com.example.dcc078.abstractfactory;

public class AdesaoNegativa implements Adesao {

    private String tipo;

    public AdesaoNegativa(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return "Adesão negativa para o sindicato de " + tipo;
    }
}


package com.example.dcc078.abstractfactory;

public class AdesaoPositiva implements Adesao {

    private String tipo;

    public AdesaoPositiva(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return "Adesão positiva para o sindicato de " + tipo;
    }
}


package com.example.dcc078.abstractfactory;

public class GuiaContribuicaoSindical implements GuiaContribuicao {

    private String codigo;
    private float valor;

    public GuiaContribuicaoSindical(String codigo, float valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public float getValor() {
        return valor;
    }
}


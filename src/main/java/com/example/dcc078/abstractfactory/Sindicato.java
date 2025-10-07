package com.example.dcc078.abstractfactory;

public class Sindicato {

    private final Adesao adesao;
    private final GuiaContribuicao guia;

    public Sindicato(FabricaAbstrata fabrica) {
        this.adesao = fabrica.createAdesao();
        this.guia = fabrica.createGuiaContribuicao();
    }

    public String getTipoAdesao() {
        return this.adesao.getTipo();
    }

    public String getGuiaContribuicao() {
        return "Código: " + this.guia.getCodigo() + ", Valor: " + this.guia.getValor();
    }
}

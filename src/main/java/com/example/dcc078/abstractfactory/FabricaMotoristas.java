package com.example.dcc078.abstractfactory;

public class FabricaMotoristas implements FabricaAbstrata {

    @Override
    public Adesao createAdesao() {
        return new AdesaoPositiva("Motoristas");
    }

    @Override
    public GuiaContribuicao createGuiaContribuicao() {
        return new GuiaContribuicaoSindical("GUIA-M", 100.0f);
    }
}


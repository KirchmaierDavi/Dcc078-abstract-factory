package com.example.dcc078.abstractfactory;

public class FabricaProfessores implements FabricaAbstrata {

    @Override
    public Adesao createAdesao() {
        return new AdesaoNegativa("Professores");
    }

    @Override
    public GuiaContribuicao createGuiaContribuicao() {
        return new GuiaContribuicaoSindical("GUIA-P", 120.0f);
    }
}


package com.example.dcc078.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaProfessoresTest {

    @Test
    void DeveRetornarAdesaoNegativaProfessores() {
        FabricaAbstrata fabrica = new FabricaProfessores();
        Adesao adesao = fabrica.createAdesao();
        assertNotNull(adesao);
        assertInstanceOf(AdesaoNegativa.class, adesao);
        assertEquals("Adesão negativa para o sindicato de Professores", adesao.getTipo());
    }

    @Test
    void DeveRetornarGuiaProfessores() {
        FabricaAbstrata fabrica = new FabricaProfessores();
        GuiaContribuicao guia = fabrica.createGuiaContribuicao();
        assertNotNull(guia);
        assertEquals("GUIA-P", guia.getCodigo());
        assertEquals(120.0f, guia.getValor());
    }
}


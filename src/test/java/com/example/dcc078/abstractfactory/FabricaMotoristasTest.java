package com.example.dcc078.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaMotoristasTest {

    @Test
    void DeveRetornarAdesaoPositivaMotoristas() {
        FabricaAbstrata fabrica = new FabricaMotoristas();
        Adesao adesao = fabrica.createAdesao();
        assertNotNull(adesao);
        assertInstanceOf(AdesaoPositiva.class, adesao);
        assertEquals("Adesão positiva para o sindicato de Motoristas", adesao.getTipo());
    }

    @Test
    void DeveRetornarGuiaMotoristas() {
        FabricaAbstrata fabrica = new FabricaMotoristas();
        GuiaContribuicao guia = fabrica.createGuiaContribuicao();
        assertNotNull(guia);
        assertEquals("GUIA-M", guia.getCodigo());
        assertEquals(100.0f, guia.getValor());
    }
}
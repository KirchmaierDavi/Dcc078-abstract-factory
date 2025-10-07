package com.example.dcc078.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SindicatoTest {

    @Test
    void deveCriarAdesaoEGuiaComFabricaMotoristas() {
        FabricaAbstrata fabrica = new FabricaMotoristas();
        Sindicato sindicato = new Sindicato(fabrica);
        assertEquals("Adesão positiva para o sindicato de Motoristas", sindicato.getTipoAdesao());
        assertEquals("Código: GUIA-M, Valor: 100.0", sindicato.getGuiaContribuicao());
    }

    @Test
    void deveCriarAdesaoEGuiaComFabricaProfessores() {
        FabricaAbstrata fabrica = new FabricaProfessores();
        Sindicato sindicato = new Sindicato(fabrica);
        assertEquals("Adesão negativa para o sindicato de Professores", sindicato.getTipoAdesao());
        assertEquals("Código: GUIA-P, Valor: 120.0", sindicato.getGuiaContribuicao());
    }
}

import example.*;
import org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {

    @org.junit.jupiter.api.Test
    void deveRetornarJogoLancamentoComDLCgratuita() {
        Jogo jogo = new DlcGratuita();
        Lancamento lancamento = new Lancamento(240.0f);
        lancamento.setJogo(jogo);
        lancamento.setMesesPassados(2);
        assertEquals(190.0f, lancamento.calcularPreco(), 0.01f);
    }

    @org.junit.jupiter.api.Test
    void deveRetornarJogoRemakeComDLCconteudoExtra() {
        Jogo jogo = new DlcConteudoExtra();
        Remake remake = new Remake(240.0f);
        remake.setJogo(jogo);
        remake.setMesesPassados(2);
        assertEquals(270.0f, remake.calcularPreco(), 0.01f);
    }
}

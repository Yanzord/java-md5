package com.yanzord.segurancadainformacao.javamd5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class HashMD5Test {

    private HashMD5 hashMD5 = new HashMD5();

    @Test
    public void deveGerarHashMD5() {
        assertEquals("bbb0d5068d6cfe7a794cce7a6257b3fa", hashMD5.geraHashMD5("ftec"));
    }

    @Test
    public void deveRetornarPalavraHashEncontrada() {
        List<PalavrasHash> palavrasHash = new ArrayList<>();
        palavrasHash.add(new PalavrasHash("ftec", "bbb0d5068d6cfe7a794cce7a6257b3fa"));

        PalavrasHash palavraHashEncontrada = hashMD5.encontraPalavraHash(palavrasHash, "bbb0d5068d6cfe7a794cce7a6257b3fa");

        assertEquals("ftec", palavraHashEncontrada.getPalavra());
        assertEquals("bbb0d5068d6cfe7a794cce7a6257b3fa", palavraHashEncontrada.getHash());
    }
}
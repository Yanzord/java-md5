package com.yanzord.segurancadainformacao.javamd5;

public class PalavrasHash {
    private String palavra;
    private String hash;

    public PalavrasHash(String palavra, String hash) {
        this.palavra = palavra;
        this.hash = hash;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getHash() {
        return hash;
    }
}

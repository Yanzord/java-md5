package com.yanzord.segurancadainformacao.javamd5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class HashMD5 {

    public String geraHashMD5(String palavra) {
        MessageDigest m = null;

        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.getMessage();
        }

        m.update(palavra.getBytes(), 0, palavra.length());

        return new BigInteger(1, m.digest()).toString(16);
    }

    public PalavrasHash encontraPalavraHash(List<PalavrasHash> palavrasHash, String hash) {
        return palavrasHash.stream()
                .filter(p -> hash.equals(p.getHash()))
                .findAny()
                .orElse(null);
    }
}
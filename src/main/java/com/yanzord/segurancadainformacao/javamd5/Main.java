package com.yanzord.segurancadainformacao.javamd5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String CAMINHO_DICIONARIO = "dicionario.txt",
               CAMINHO_HASHES = "hashes.txt";

        HashMD5 hashMD5 = new HashMD5();
        List<PalavrasHash> palavrasHash = new ArrayList<>();

        ArquivoDAO arquivoDicionario = new ArquivoDAO(CAMINHO_DICIONARIO);
        ArquivoDAO arquivoHashes = new ArquivoDAO(CAMINHO_HASHES);

        List<String> dicionario = new ArrayList<>(arquivoDicionario.lerArquivo());
        List<String> hashes = new ArrayList<>(arquivoHashes.lerArquivo());

        if (dicionario.size() == 0 || hashes.size() == 0) {
            System.out.println("Informe as palavras no arquivo dicionario.txt e as hashs no arquivo hashes.txt.");
            System.exit(0);
        }

        for (String palavra : dicionario) {
            palavrasHash.add(new PalavrasHash(palavra, hashMD5.geraHashMD5(palavra)));
        }

        for (String hash : hashes) {
            PalavrasHash palavraHashEncontrada = hashMD5.encontraPalavraHash(palavrasHash, hash);

            if (palavraHashEncontrada == null) {
                System.out.println(hash + ": " + "nenhuma palavra encontrada \n");
            } else {
                System.out.println(palavraHashEncontrada.getHash() + ": " + palavraHashEncontrada.getPalavra());
            }
        }
    }
}
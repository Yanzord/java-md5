package com.yanzord.segurancadainformacao.javamd5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArquivoDAO {

    private Path caminhoArquivo;

    public ArquivoDAO(String caminhoArquivo) {
        this.caminhoArquivo = Paths.get(caminhoArquivo);
        criarArquivoSeNaoExistir(this.caminhoArquivo);
    }

    public List<String> lerArquivo() {
        criarArquivoSeNaoExistir(caminhoArquivo);
        List<String> linhasDoArquivo = new ArrayList<>();

        try {
            linhasDoArquivo = Files.readAllLines(caminhoArquivo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return linhasDoArquivo;
    }

    private void criarArquivoSeNaoExistir(Path caminhoArquivo) {
        if (!Files.exists(caminhoArquivo)) {
            try {
                Files.createFile(caminhoArquivo);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

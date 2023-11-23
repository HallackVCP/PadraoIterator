package org.example;

import java.util.Iterator;

public class DisponibilidadeLivros {
    public static Integer contarLivrosDisponiveisBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator a = biblioteca.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}

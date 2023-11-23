import org.example.Biblioteca;
import org.example.DisponibilidadeLivros;
import org.example.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisponibilidadeLivrosTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Livro 1","Marco", true),
                new Livro( "Livro 2","Antonio", true),
                new Livro("Livro 3","Jose", false),
                new Livro("Livro 4","Maria", true)
        );
        assertEquals(3, DisponibilidadeLivros.contarLivrosDisponiveisBiblioteca(biblioteca));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Livro 1","Marco", true),
                new Livro( "Livro 2","Antonio", true),
                new Livro("Livro 3","Jose", false),
                new Livro("Livro 4","Maria", true)
        );
        assertEquals(4, DisponibilidadeLivros.contarTotalLivrosBiblioteca(biblioteca));
    }

}
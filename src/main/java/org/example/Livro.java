package org.example;

public class Livro {
    private String titulo;
    private String autor;

    private boolean isDisponivel;

    public Livro(String titulo, String autor, Boolean isDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isDisponivel = isDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }
}

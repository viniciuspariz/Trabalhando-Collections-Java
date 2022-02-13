package br.dio.collection.map;

import java.util.Objects;

public class Contato {

    private String Nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        Nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Nome.equals(contato.Nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Nome='" + Nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

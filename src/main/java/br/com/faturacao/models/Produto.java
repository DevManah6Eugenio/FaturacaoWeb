package br.com.faturacao.models;

import java.util.List;

public class Produto {
    private int id;
    private String nome;

    List<MateriaPrima> materiasPrima;
    
    List<Formulacao> formulacoes;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<MateriaPrima> getMateriasPrima() {
        return materiasPrima;
    }

    public void setMateriasPrima(List<MateriaPrima> materiasPrima) {
        this.materiasPrima = materiasPrima;
    }

    public List<Formulacao> getFormulacoes() {
        return formulacoes;
    }

    public void setFormulacoes(List<Formulacao> formulacoes) {
        this.formulacoes = formulacoes;
    }
}

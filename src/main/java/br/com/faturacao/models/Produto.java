package br.com.faturacao.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String codigo;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", materiasPrima=" + materiasPrima + ", formulacoes=" + formulacoes + '}';
    }
    
}

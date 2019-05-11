package br.com.faturacao.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "codigo")
    private String codigo;

    @ManyToMany
    List<MateriaPrima> materiasPrima;

    @ManyToMany
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
        if (this.materiasPrima == null) {
            this.materiasPrima = new ArrayList<>();
        }
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

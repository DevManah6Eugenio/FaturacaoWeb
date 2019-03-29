package br.com.faturacao.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MateriaPrima implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String unidadeCompra;
    private Double valor;

    private List<Fornecedor> fornecedores;

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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    @Override
    public String toString() {
        return "MateriaPrima{" + "id=" + id + ", nome=" + nome + ", unidadeCompra=" + unidadeCompra + ", valor=" + valor + ", fornecedores=" + fornecedores + '}';
    }

    @Override
    public boolean equals(Object obj) {
        MateriaPrima materia = (MateriaPrima) obj;
        if (this.getId() == materia.getId()) {
            return true;
        }
        return false;
    }
}

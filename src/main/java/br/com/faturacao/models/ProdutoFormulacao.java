package br.com.faturacao.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author manasses
 */
@Entity
public class ProdutoFormulacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "quantidade")
    private Double quantidade;
    @Column(name = "valor")
    private Double valor;
    
    @OneToOne
    List<Formulacao> formulacao;
    
    @OneToOne
    List<Produto> produto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Formulacao> getFormulacao() {
        return formulacao;
    }

    public void setFormulacao(List<Formulacao> formulacao) {
        this.formulacao = formulacao;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ProdutoFormulacao{" + "id=" + id + ", quantidade=" + quantidade + ", valor=" + valor + ", formulacao=" + formulacao + ", produto=" + produto + '}';
    }
}

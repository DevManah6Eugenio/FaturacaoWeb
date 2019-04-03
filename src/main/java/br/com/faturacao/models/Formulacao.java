package br.com.faturacao.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formulacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double quantidadeEstimadaProduzida;
    private Double icm;
    private Double pis;
    private Double confis;
    private Double comissao;
    private Double margemLucro;
    private Double despesaFixa;
    private Double outrosDescontos;
    private Double custoEstimado;
    private String obs;
    private Double valorVenda;

    List<Produto> produtos;

    public Formulacao() {
    }

    public Formulacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuantidadeEstimadaProduzida() {
        return quantidadeEstimadaProduzida;
    }

    public void setQuantidadeEstimadaProduzida(Double quantidadeEstimadaProduzida) {
        this.quantidadeEstimadaProduzida = quantidadeEstimadaProduzida;
    }

    public Double getIcm() {
        return icm;
    }

    public void setIcm(Double icm) {
        this.icm = icm;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getConfis() {
        return confis;
    }

    public void setConfis(Double confis) {
        this.confis = confis;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Double getDespesaFixa() {
        return despesaFixa;
    }

    public void setDespesaFixa(Double despesaFixa) {
        this.despesaFixa = despesaFixa;
    }

    public Double getOutrosDescontos() {
        return outrosDescontos;
    }

    public void setOutrosDescontos(Double outrosDescontos) {
        this.outrosDescontos = outrosDescontos;
    }

    public Double getCustoEstimado() {
        return custoEstimado;
    }

    public void setCustoEstimado(Double custoEstimado) {
        this.custoEstimado = custoEstimado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Formulacao{" + "id=" + id + ", quantidadeEstimadaProduzida=" + quantidadeEstimadaProduzida + ", icm=" + icm + ", pis=" + pis + ", confis=" + confis + ", comissao=" + comissao + ", margemLucro=" + margemLucro + ", despesaFixa=" + despesaFixa + ", outrosDescontos=" + outrosDescontos + ", custoEstimado=" + custoEstimado + ", obs=" + obs + ", valorVenda=" + valorVenda + ", produtos=" + produtos + '}';
    }
    
    
}

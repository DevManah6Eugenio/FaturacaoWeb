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
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cnpj", nullable = false)
    private String cpf;
    @Column(name = "empresa", nullable = false)
    private String empresa;
    @Column(name = "telefone01")
    private String telefone1;
    @Column(name = "telefone02")
    private String telefone2;
    @Column(name = "nome_representante", nullable = false)
    private String nomeRepresentante;
    @Column(name = "email")
    private String email;

    @ManyToMany
    private List<MateriaPrima> materiPrima;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public List<MateriaPrima> getMateriPrima() {
        if (this.materiPrima == null) {
            this.materiPrima = new ArrayList<>();
        }
        return materiPrima;
    }

    public void setMateriPrima(List<MateriaPrima> materiPrima) {
        this.materiPrima = materiPrima;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "cpf=" + cpf + ", empresa=" + empresa + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", nomeRepresentante=" + nomeRepresentante + ", email=" + email + ", materiPrima=" + materiPrima + '}';
    }
}

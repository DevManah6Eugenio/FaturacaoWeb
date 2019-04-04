package br.com.faturacao.bo;

import br.com.faturacao.models.Fornecedor;
import java.util.List;

/**
 *
 * @author manasses
 */
public class FornecedorBO implements BoInterface<Fornecedor> {

    @Override
    public void cadastrar(Fornecedor obj) {
        System.out.println("cadastrar");
    }

    @Override
    public void editar(Fornecedor obj) {
        System.out.println("editar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor carregar(Fornecedor obj) {
        System.out.println("carregar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> listar(Fornecedor obj) {
        System.out.println("listar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Fornecedor obj) {
        System.out.println("deletar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

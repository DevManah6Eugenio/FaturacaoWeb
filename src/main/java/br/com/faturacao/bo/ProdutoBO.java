package br.com.faturacao.bo;

import br.com.faturacao.dao.ProdutoDao;
import br.com.faturacao.models.Produto;
import java.util.List;

/**
 *
 * @author manasses
 */
public class ProdutoBO implements BoInterface<Produto> {
    
     private final ProdutoDao dao;
    
    public ProdutoBO() {
        dao = new ProdutoDao();
    }

    @Override
    public void cadastrar(Produto obj) {
        dao.salvar(obj);
    }

    @Override
    public void editar(Produto obj) {
        System.out.println("editar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto carregar(Produto obj) {
        System.out.println("carregar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> listar(Produto obj) {
        System.out.println("listar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Produto obj) {
        System.out.println("deletar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

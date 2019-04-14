package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.Fornecedor;
import br.com.faturacao.models.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ProdutoDao implements Dao<Produto> {

    private EntityManager em;

    @Override
    public void salvar(Produto objeto) {
        em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new RuntimeException();
        } finally {
            em.close();
        }
    }

    @Override
    public void editar(Produto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Produto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> listar(Produto filtro) {
        List<Produto> listProduto;
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query query = em.createQuery("select p from Produto p ");
            listProduto = (List<Produto>) query.getResultList();
        } finally {
            em.close();
        }

        return listProduto;
    }

    @Override
    public Produto carregar(Produto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

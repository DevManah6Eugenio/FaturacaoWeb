package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class FornecedorDao implements Dao<Fornecedor> {

    private EntityManager em;

    @Override
    public void salvar(Fornecedor objeto) {
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
    public void editar(Fornecedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Fornecedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> listar(Fornecedor filtro) {
        List<Fornecedor> listFornecedor;
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query query = em.createQuery("select f from Fornecedor f ");
            listFornecedor = (List<Fornecedor>) query.getResultList();
        } finally {
            em.close();
        }

        return listFornecedor;
    }

    @Override
    public Fornecedor carregar(Fornecedor objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

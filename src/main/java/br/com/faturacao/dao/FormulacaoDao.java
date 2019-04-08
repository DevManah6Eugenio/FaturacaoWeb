package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.Formulacao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class FormulacaoDao implements Dao<Formulacao>{
    
    private EntityManager em;

    @Override
    public void salvar(Formulacao objeto) {

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
    public void editar(Formulacao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Formulacao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formulacao> listar(Formulacao filtro) {
            List<Formulacao> listFormulacao;
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query query = em.createQuery("select f from Formulacao f ");
            listFormulacao = (List<Formulacao>) query.getResultList();
        } finally {
            em.close();
        }

        return listFormulacao;
    }

    @Override
    public Formulacao carregar(Formulacao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

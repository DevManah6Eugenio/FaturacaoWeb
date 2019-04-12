package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.MateriaPrima;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MateriaPrimaDao implements Dao<MateriaPrima> {

    private EntityManager em;

    @Override
    public void salvar(MateriaPrima objeto) {
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
    public void editar(MateriaPrima objeto) {

    }

    @Override
    public void excluir(MateriaPrima objeto) {

    }

    @Override
    public MateriaPrima carregar(MateriaPrima objeto) {
        return null;
    }

    @Override
    public List<MateriaPrima> listar(MateriaPrima filtro) {
       
        List<MateriaPrima> listMateriPrima;
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query query = em.createQuery("select m from MateriaPrima m " + montarWere(filtro));
            listMateriPrima = (List<MateriaPrima>) query.getResultList();
        } finally {
            em.close();
        }

        return listMateriPrima;
    }
    
    private String montarWere(MateriaPrima filtro) { 
        String where = "";
        
        if ("".equals(filtro.getCodigo())) {
            where = "m.codigo like % " + filtro.getCodigo() + "% ";
        }
        
        return where;
    }
}

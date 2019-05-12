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

    public List<MateriaPrima> listarTodos() {
        List<MateriaPrima> listMateriPrima = null;
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query query = em.createQuery("select m from MateriaPrima m ");
            listMateriPrima = (List<MateriaPrima>) query.getResultList();
        } finally {
            em.close();
        }

        return listMateriPrima;
    }

    @Override
    public List<MateriaPrima> listar(MateriaPrima filtro) {

        List<MateriaPrima> listMateriPrima;
        EntityManager em = JPAUtil.getEntityManager();

        try {
            Query query = em.createQuery("select m from MateriaPrima m " + montarWere(filtro));

            if (!"".equals(filtro.getNome().trim())) {
                query.setParameter("nome", "%" + filtro.getNome() + "%");
            }

            if (!"".equals(filtro.getCodigo().trim())) {
                query.setParameter("codigo", "%" + filtro.getCodigo() + "%");
            }

            if (!"".equals(filtro.getUnidadeCompra().trim())) {
                query.setParameter("unidade_compra", "%" + filtro.getUnidadeCompra() + "%");
            }

            listMateriPrima = (List<MateriaPrima>) query.getResultList();
        } finally {
            em.close();
        }

        return listMateriPrima;
    }

    private String montarWere(MateriaPrima filtro) {

        String where = " where 1 = 1 ";

        if (!"".equals(filtro.getNome().trim())) {
            where += " and m.nome like :nome ";
        }

        if (!"".equals(filtro.getCodigo().trim())) {
            where += " and m.codigo like :codigo ";
        }

        if (!"".equals(filtro.getUnidadeCompra().trim())) {
            where += " and m.unidadeCompra like :unidade_compra ";
        }

        return where;
    }
}

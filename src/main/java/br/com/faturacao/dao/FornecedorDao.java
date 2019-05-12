package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.Fornecedor;
import br.com.faturacao.models.MateriaPrima;
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
            Query query = em.createQuery("select f from Fornecedor left join fornecedor_materiaprima f " + montarWhere(filtro));

            if (!"".equals(filtro.getCnpj().trim())) {
                query.setParameter("cnpj", "%" + filtro.getCnpj() + "%");
            }

            if (!"".equals(filtro.getEmpresa().trim())) {
                query.setParameter("empresa", "%" + filtro.getEmpresa() + "%");
            }

            if (!"".equals(filtro.getNomeRepresentante().trim())) {
                query.setParameter("nome_representante", "%" + filtro.getNomeRepresentante() + "%");
            }

            if (filtro.getMateriPrima().size() > 0) {
                List<MateriaPrima> listaMateria = filtro.getMateriPrima();
                query.setParameter("nome_representante", listaMateria.get(0).getId());
            }

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

    private String montarWhere(Fornecedor filtro) {
        String where = " where 1 = 1 ";

        if (!"".equals(filtro.getCnpj().trim())) {
            where += " and f.cnpj like :cnpj ";
        }

        if (!"".equals(filtro.getEmpresa().trim())) {
            where += " and f.empresa like :empresa ";
        }

        if (!"".equals(filtro.getNomeRepresentante().trim())) {
            where += " and f.nomeRepresentante like :nome_representante ";
        }

        if (filtro.getMateriPrima().size() > 0) {

            where += " and f.nomeRepresentante like :nome_representante ";
        }

        return where;
    }
}

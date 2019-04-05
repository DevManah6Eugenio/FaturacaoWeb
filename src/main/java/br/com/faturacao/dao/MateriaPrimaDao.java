package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.MateriaPrima;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

public class MateriaPrimaDao implements Dao<MateriaPrima> {

    private EntityManager em;

    @Override
    public void salvar(MateriaPrima objeto) {

        if (objIsValido(objeto)) {

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
        } else {
            new Exception();
        }
    }

    @Override
    public void editar(MateriaPrima objeto) {

    }

    @Override
    public void excluir(MateriaPrima objeto) {

    }

    @Override
    public List<MateriaPrima> listar(int primeiroResutlado, int ultimoResultado, MateriaPrima filtro) {
        return null;
    }

    @Override
    public MateriaPrima carregar(MateriaPrima objeto) {
        return null;
    }

    @Override
    public boolean objIsValido(MateriaPrima objeto) {
        return true;
    }

}

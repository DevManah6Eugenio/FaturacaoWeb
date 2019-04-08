package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

public class UsuarioDao implements Dao<Usuario> {

    private EntityManager em;

    @Override
    public void salvar(Usuario objeto) {
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
    public void editar(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar(Usuario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario carregar(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean objIsValido(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

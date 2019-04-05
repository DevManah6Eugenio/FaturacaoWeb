package br.com.faturacao.dao;

import br.com.faturacao.apoio.JPAUtil;
import br.com.faturacao.models.Formulacao;
import java.util.List;
import javax.persistence.EntityManager;

public class FormulacaoDao implements Dao<Formulacao>{
    
    private EntityManager em;

    @Override
    public void salvar(Formulacao objeto) {
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
    public void editar(Formulacao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Formulacao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Formulacao carregar(Formulacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Formulacao> listar(int primeiroResutlado, int ultimoResultado, Formulacao filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean objIsValido(Formulacao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

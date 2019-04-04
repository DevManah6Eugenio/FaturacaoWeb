package br.com.faturacao.bo;

import br.com.faturacao.dao.FormulacaoDao;
import br.com.faturacao.models.Formulacao;
import java.util.List;

/**
 *
 * @author manasses
 */
public class FormulacaoBO implements BoInterface<Formulacao> {

    private FormulacaoDao dao;
    
    @Override
    public void cadastrar(Formulacao obj) {
        try {
            dao = new FormulacaoDao();
            dao.salvar(obj);
        } finally {
            dao = null;
        }
        System.out.println("cadastrar");
    }

    @Override
    public void editar(Formulacao obj) {
        try {
            dao = new FormulacaoDao();
            dao.editar(obj);
        } finally {
            dao = null;
        }
        System.out.println("editar");
    }

    @Override
    public Formulacao carregar(Formulacao obj) {
        try {
            dao = new FormulacaoDao();
            return dao.carregar(obj);
        } finally {
            dao = null;
        }
    }

    @Override
    public List<Formulacao> listar(Formulacao obj) {
        try {
            System.out.println("listar");
            dao = new FormulacaoDao();
            return dao.listar(0,0,obj);
        } finally {
            dao = null;
        }
    }

    @Override
    public void deletar(Formulacao obj) {
        System.out.println("deletar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

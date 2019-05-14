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

    public FormulacaoBO() {
        dao = new FormulacaoDao();
    }

    @Override
    public void cadastrar(Formulacao obj) {
        dao.salvar(obj);
    }

    @Override
    public void editar(Formulacao obj) {
        dao.editar(obj);
    }

    @Override
    public Formulacao carregar(Formulacao obj) {
        return dao.carregar(obj);
    }

    @Override
    public List<Formulacao> listar(Formulacao obj) {
        return dao.listar(obj);
    }

    @Override
    public void deletar(Formulacao obj) {
        System.out.println("deletar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

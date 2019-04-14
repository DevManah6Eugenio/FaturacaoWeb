package br.com.faturacao.bo;

import br.com.faturacao.dao.MateriaPrimaDao;
import br.com.faturacao.models.MateriaPrima;
import java.util.List;

/**
 *
 * @author manasses
 */
public class MateriaPrimaBO implements BoInterface<MateriaPrima> {

    private MateriaPrimaDao dao;
    
    public MateriaPrimaBO(){
        dao = new MateriaPrimaDao();
    }
    
    @Override
    public void cadastrar(MateriaPrima obj) {
        dao.salvar(obj);
    }

    @Override
    public void editar(MateriaPrima obj) {
        dao.editar(obj);
    }

    @Override
    public MateriaPrima carregar(MateriaPrima obj) {
        return dao.carregar(obj);
    }

    @Override
    public List<MateriaPrima> listar(MateriaPrima obj) {        
        List<MateriaPrima> lista = dao.listar(obj);
        return lista;
    }

    @Override
    public void deletar(MateriaPrima obj) {
        dao.excluir(obj);
    }
    
}

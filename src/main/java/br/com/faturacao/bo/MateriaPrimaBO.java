package br.com.faturacao.bo;

import br.com.faturacao.models.MateriaPrima;
import java.util.List;

/**
 *
 * @author manasses
 */
public class MateriaPrimaBO implements BoInterface<MateriaPrima> {

    @Override
    public void cadastrar(MateriaPrima obj) {
        System.out.println("cadastrar");
    }

    @Override
    public void editar(MateriaPrima obj) {
        System.out.println("editar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MateriaPrima carregar(MateriaPrima obj) {
        System.out.println("carregar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MateriaPrima> listar(MateriaPrima obj) {
        System.out.println("listar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(MateriaPrima obj) {
        System.out.println("deletar");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

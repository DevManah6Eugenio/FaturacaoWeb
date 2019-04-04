package br.com.faturacao.controlador;

import br.com.faturacao.bo.ProdutoBO;
import br.com.faturacao.models.Produto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class ProdutoControlador extends Controlador<Produto> {

    {
        this.bo = new ProdutoBO();
    }
    
    @Override
    public Produto montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Produto produto = new Produto();
            return produto;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
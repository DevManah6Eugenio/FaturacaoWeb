package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.bo.ProdutoBO;
import br.com.faturacao.models.Produto;
import java.util.ArrayList;
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
            produto.setId(Converter.toInt(request.getParameter("id")));
            produto.setCodigo(request.getParameter("codigo"));
            produto.setNome(request.getParameter("descricao"));
            
            produto.setMateriasPrima(new ArrayList<>());
            
            return produto;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
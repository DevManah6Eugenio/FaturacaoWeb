package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.bo.ProdutoBO;
import br.com.faturacao.models.MateriaPrima;
import br.com.faturacao.models.Produto;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class ProdutoControlador extends Controlador<Produto> {

    public ProdutoControlador() {
        super(Produto.class);
        this.bo = new ProdutoBO();
    }

    @Override
    public Produto montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Produto produto = new Produto();
            produto.setId(Converter.toInt(request.getParameter("id")));
            produto.setCodigo(request.getParameter("codigo"));
            produto.setNome(request.getParameter("descricao"));

            String idsMateriaPrima = request.getParameter("ids_materia_prima");
            for (String id : idsMateriaPrima.split(",")) {
                MateriaPrima m = new MateriaPrima();
                m.setId(Converter.toInt(id));
                produto.getMateriasPrima().add(m);
            }

            return produto;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

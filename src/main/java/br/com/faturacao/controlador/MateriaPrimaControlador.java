package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.bo.MateriaPrimaBO;
import br.com.faturacao.models.MateriaPrima;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class MateriaPrimaControlador extends Controlador<MateriaPrima> {

    public MateriaPrimaControlador() {
        super(MateriaPrima.class);
        this.bo = new MateriaPrimaBO();
    }

    @Override
    public MateriaPrima montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            MateriaPrima materiaPrima = new MateriaPrima();
            materiaPrima.setId(Converter.toInt(request.getParameter("id_materia_prima")));
            materiaPrima.setNome(request.getParameter("descricao"));
            materiaPrima.setCodigo(request.getParameter("codigo"));
            materiaPrima.setUnidadeCompra(request.getParameter("unidade_compra"));
            materiaPrima.setValor(Converter.toDouble(request.getParameter("valor")));

            materiaPrima.setFornecedores(new ArrayList<>());

            return materiaPrima;
        } catch (Exception ex) {
            throw new Exception();
        }
    }
}

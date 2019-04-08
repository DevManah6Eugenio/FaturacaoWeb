package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.bo.MateriaPrimaBO;
import br.com.faturacao.models.MateriaPrima;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class MateriaPrimaControlador extends Controlador<MateriaPrima> {

    public MateriaPrimaControlador() {
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

    @Override
    public void cadastrar(HttpServletRequest request, HttpServletResponse response) { 
        try {
            MateriaPrima obj = montarObjeto(request, response);
            bo.cadastrar(obj);
            response.sendRedirect(request.getContextPath() + TelasConsulta.MATERIA_PRIMA.getTela());
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
     @Override
    public void listar(HttpServletRequest request, HttpServletResponse response) {
        try {
            MateriaPrima obj = montarObjeto(request, response);
            bo.listar(obj);
            response.sendRedirect(request.getContextPath() + TelasConsulta.MATERIA_PRIMA.getTela());
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.models.MateriaPrima;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class MateriaPrimaControlador extends HttpServlet {

    private String acao;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            acao = request.getParameter("acao");

            if (acao.equalsIgnoreCase(Acao.CADASTRAR.getAcao())) {
                this.cadastrar(request);
            } else if (acao.equals(Acao.CARREGAR.getAcao())) {

            } else if (acao.equals(Acao.DELETAR.getAcao())) {

            } else if (acao.equals(Acao.EDITAR.getAcao())) {

            } else if (acao.equals(Acao.LISTAR.getAcao())) {

            }
        } catch (Exception e) {
//            throw new Exception();
        }
    }

    private void cadastrar(HttpServletRequest request) throws Exception {
        MateriaPrima materiaPrima = null;
        try {
            materiaPrima = doMateriaPrima(request);
        } catch (Exception ex) {
            throw new Exception();
        }
    }

    private MateriaPrima doMateriaPrima(HttpServletRequest request) throws Exception {

        try {
            MateriaPrima materiaPrima = new MateriaPrima();
            materiaPrima.setId(Converter.toInt(request.getParameter("id_materia_prima")));
            materiaPrima.setNome(request.getParameter("descricao"));
            materiaPrima.setCodigo(request.getParameter("codigo"));
            materiaPrima.setUnidadeCompra(request.getParameter("unidade_compra"));
            materiaPrima.setValor(Converter.toDouble(request.getParameter("valor")));
            return materiaPrima;
        } catch (Exception ex) {
            throw new Exception();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

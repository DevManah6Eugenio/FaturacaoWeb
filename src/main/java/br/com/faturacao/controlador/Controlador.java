package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.models.MateriaPrima;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 * @param <T>
 */
public class Controlador <T> extends ControladorImpl <T>  {
    
    private String acao;
    
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            acao = request.getParameter("acao");

            if (acao.equalsIgnoreCase(AcaoControlador.CADASTRAR.getAcao())) {
                this.cadastrar(request, response);
            } else if (acao.equals(AcaoControlador.CARREGAR.getAcao())) {
                this.carregar(request, response);
            } else if (acao.equals(AcaoControlador.DELETAR.getAcao())) {
                this.deletar(request, response);
            } else if (acao.equals(AcaoControlador.EDITAR.getAcao())) {
                this.editar(request, response);
            } else if (acao.equals(AcaoControlador.LISTAR.getAcao())) {
                this.listar(request, response);
            }
        } catch (Exception e) {
//            throw new Exception();
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
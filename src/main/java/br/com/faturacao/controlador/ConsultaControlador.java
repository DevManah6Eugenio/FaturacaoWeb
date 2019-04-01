package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class ConsultaControlador extends ControladorAbstract {

    private Telas codTela;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        codTela = Telas.getOpcao(Converter.toInt(request.getParameter("codTela")));

        if (null != codTela) switch (codTela) {
            case CONSULTA_FORMULACAO:
                response.sendRedirect(request.getContextPath() + TelasConsulta.FORMULACAO.getTela());
                break;
            case CONSULTA_FORNECEDOR:
                response.sendRedirect(request.getContextPath() + TelasConsulta.FORNECEDOR.getTela());
                break;
            case CONSULTA_MATERIA_PRIMA:
                response.sendRedirect(request.getContextPath() + TelasConsulta.MATERIA_PRIMA.getTela());
                break;
            case CONSULTA_PRODUTO:
                response.sendRedirect(request.getContextPath() + TelasConsulta.PRODUTO.getTela());
                break;
            default:
                throw new IllegalArgumentException();
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

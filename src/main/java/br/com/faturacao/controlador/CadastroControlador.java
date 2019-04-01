package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class CadastroControlador extends HttpServlet {

    private Telas codTela;
    RequestDispatcher dispatcher = null;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        codTela = Telas.getOpcao(Converter.toInt(request.getParameter("codTela")));

        if (null != codTela) switch (codTela) {
            case CADASTRO_FORMULACAO:
                response.sendRedirect(request.getContextPath() + TelasCadastro.FORMULACAO.getTela());
                break;
            case CADASTRO_FORNECEDOR:
                response.sendRedirect(request.getContextPath() + TelasCadastro.FORNECEDOR.getTela());
                break;
            case CADASTRO_MATERIA_PRIMA:
                response.sendRedirect(request.getContextPath() + TelasCadastro.MATERIA_PRIMA.getTela());
                break;
            case CADASTRO_PRODUTO:
                response.sendRedirect(request.getContextPath() + TelasCadastro.PRODUTO.getTela());                
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

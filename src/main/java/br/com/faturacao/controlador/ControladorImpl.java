package br.com.faturacao.controlador;

import br.com.faturacao.bo.BoInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

/**
 *
 * @author manases
 * @param <T>
 */
public abstract class ControladorImpl<T> extends HttpServlet implements ControladorInterface<T> {

    protected BoInterface bo;
    private final Class<T> type;
    
    public ControladorImpl(Class<T> type) {
        this.type = type;
    }
    
    @Override
    public void cadastrar(HttpServletRequest request, HttpServletResponse response) {
        try {
            T obj = montarObjeto(request, response);
            bo.cadastrar(obj);
            response.sendRedirect("ConsultaControlador?codTela=" + request.getParameter("cod_tela_consulta"));
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(HttpServletRequest request, HttpServletResponse response) {
        try {
            T obj = montarObjeto(request, response);
            bo.editar(obj);
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void carregar(HttpServletRequest request, HttpServletResponse response) {
        try {
            T obj = montarObjeto(request, response);
            bo.carregar(obj);
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void listar(HttpServletRequest request, HttpServletResponse response) {
        try {
            T obj = montarObjeto(request, response);
            XStream xstream = new XStream(new JettisonMappedXmlDriver());
            xstream.alias(type.getSimpleName(), type);
            String json = xstream.toXML(bo.listar(obj));
            response.getWriter().append(json);
            response.getWriter().close();
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletar(HttpServletRequest request, HttpServletResponse response) {
        try {
            T obj = montarObjeto(request, response);
            bo.deletar(obj);
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
package br.com.faturacao.controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 * @param <T>
 */
public abstract class ControladorImpl <T> extends HttpServlet  implements ControladorInterface<T> {

    @Override
    public void cadastrar(HttpServletRequest request, HttpServletResponse response) {
        try {
            Object obj = montarObjeto(request, response);
            System.out.println(obj.toString());
        } catch (Exception ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void carregar(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void listar(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public void deletar(HttpServletRequest request, HttpServletResponse response) {

    }
    
}

package br.com.faturacao.controlador;

import br.com.faturacao.bo.BoInterface;
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
public abstract class ControladorImpl<T> extends HttpServlet implements ControladorInterface<T> {

    protected BoInterface bo;
    
    @Override
    public void cadastrar(HttpServletRequest request, HttpServletResponse response) {
        try {
            T obj = montarObjeto(request, response);
            bo.cadastrar(obj);
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
            bo.listar(obj);
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
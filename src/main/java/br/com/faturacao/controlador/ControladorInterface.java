package br.com.faturacao.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 * @param <T>
 */
public interface ControladorInterface <T>{
 
    abstract void cadastrar(HttpServletRequest request, HttpServletResponse response);
    
    abstract void editar(HttpServletRequest request, HttpServletResponse response);

    abstract void carregar(HttpServletRequest request, HttpServletResponse response);

    abstract void listar(HttpServletRequest request, HttpServletResponse response);

    abstract void deletar(HttpServletRequest request, HttpServletResponse response);
    
    abstract T montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception;
}

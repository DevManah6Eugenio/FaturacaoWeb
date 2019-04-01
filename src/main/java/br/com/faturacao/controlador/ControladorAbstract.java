package br.com.faturacao.controlador;

import javax.servlet.http.HttpServlet;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author manasses
 * @param <T>
 */
public abstract class ControladorAbstract <T> extends HttpServlet {

    protected final Logger LOG = LogManager.getLogger(this.getClass());
    
}

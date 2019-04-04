package br.com.faturacao.controlador;

import br.com.faturacao.bo.FornecedorBO;
import br.com.faturacao.models.Fornecedor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class FornecedorControlador extends Controlador<Fornecedor> {
 
    {
        this.bo = new FornecedorBO();
    }
    
    @Override
    public Fornecedor montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Fornecedor fornecedor = new Fornecedor();
            return fornecedor;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

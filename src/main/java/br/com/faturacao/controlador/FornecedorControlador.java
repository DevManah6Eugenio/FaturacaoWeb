package br.com.faturacao.controlador;

import br.com.faturacao.bo.FornecedorBO;
import br.com.faturacao.models.Fornecedor;
import br.com.faturacao.models.MateriaPrima;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
            fornecedor.setCpf(request.getParameter("cnpj"));
            fornecedor.setEmail(request.getParameter("email"));
            fornecedor.setEmpresa(request.getParameter("empresa"));
            fornecedor.setNomeRepresentante(request.getParameter("representante"));
            fornecedor.setTelefone1(request.getParameter("telefone01"));
            fornecedor.setTelefone2(request.getParameter("telefone02"));
        
            fornecedor.setMateriPrima(new ArrayList<>());
            
            return fornecedor;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

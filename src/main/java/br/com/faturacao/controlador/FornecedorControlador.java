package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.bo.FornecedorBO;
import br.com.faturacao.models.Fornecedor;
import br.com.faturacao.models.MateriaPrima;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class FornecedorControlador extends Controlador<Fornecedor> {

    public FornecedorControlador() {
        super(Fornecedor.class);
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

            fornecedor.setMateriPrima(doMateriaPrima(request, response));

            return fornecedor;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    private ArrayList<MateriaPrima> doMateriaPrima(HttpServletRequest request, HttpServletResponse response) {
        String idsMateriaPrima;
        ArrayList<MateriaPrima> lista;
        try {
            lista = new ArrayList<>();
            idsMateriaPrima = request.getParameter("ids_materia_prima");
            System.out.println("ids" + idsMateriaPrima);
            for (String id : idsMateriaPrima.split(",")) {
                MateriaPrima m = new MateriaPrima();
                m.setId(Converter.toInt(id));
                lista.add(m);
                System.out.println("id: " + id);
            }
            return lista;
        } finally {
            
        }
    }
}

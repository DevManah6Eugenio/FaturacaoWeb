package br.com.faturacao.controlador;

import br.com.faturacao.bo.FormulacaoBO;
import br.com.faturacao.models.Formulacao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class FormulacaoControlador extends Controlador<Formulacao,FormulacaoBO> {

    @Override
    public Formulacao montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Formulacao formulacao = new Formulacao();
            return formulacao;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

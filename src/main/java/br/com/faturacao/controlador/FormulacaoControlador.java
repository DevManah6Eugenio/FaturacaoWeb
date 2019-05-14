package br.com.faturacao.controlador;

import br.com.faturacao.apoio.Converter;
import br.com.faturacao.bo.FormulacaoBO;
import br.com.faturacao.models.Formulacao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manases
 */
public class FormulacaoControlador extends Controlador<Formulacao> {

    public FormulacaoControlador() {
        super(Formulacao.class);
        this.bo = new FormulacaoBO();
    }

    @Override
    public Formulacao montarObjeto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            Formulacao formulacao = new Formulacao();
            formulacao.setCustoEstimado(Converter.toDouble(request.getParameter("custo_estimado")));
            formulacao.setObs(request.getParameter("observacao"));
            formulacao.setValorVenda(Converter.toDouble(request.getParameter("valor_venda")));
            formulacao.setQuantidadeEstimadaProduzida(Converter.toDouble(request.getParameter("qtd_estimada_produzida")));

            formulacao.setIcm(Converter.toDouble(request.getParameter("icm")));
            formulacao.setPis(Converter.toDouble(request.getParameter("pis")));
            formulacao.setConfis(Converter.toDouble(request.getParameter("confis")));
            formulacao.setComissao(Converter.toDouble(request.getParameter("comissao")));
            formulacao.setMargemLucro(Converter.toDouble(request.getParameter("margem_lucro")));
            formulacao.setDespesaFixa(Converter.toDouble(request.getParameter("despesa_fixa")));
            formulacao.setOutrosDescontos(Converter.toDouble(request.getParameter("outros_descontos")));

            return formulacao;
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

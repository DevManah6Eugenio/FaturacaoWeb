package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum TelasConsulta {

    PRODUTO("/consulta_produto.jsp"),
    MATERIA_PRIMA("/consulta_materiaprima.jsp"),
    FORNECEDOR("/consulta_fornecedor.jsp"),
    FORMULACAO("/consulta_formulacao.jsp");
    
    private final String url;
    
    TelasConsulta(String tela) {
        this.url = tela;
    }
    
    public String getTela () {
        return url;
    }    
}

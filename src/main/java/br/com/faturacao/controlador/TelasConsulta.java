package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum TelasConsulta {

    PRODUTO("/consulta/consulta_produto.jsp"),
    MATERIA_PRIMA("/consulta/consulta_materiaprima.jsp"),
    FORNECEDOR("/consulta/consulta_fornecedor.jsp"),
    FORMULACAO("/consulta/consulta_formulacao.jsp");
    
    private final String url;
    
    TelasConsulta(String tela) {
        this.url = tela;
    }
    
    public String getTela () {
        return url;
    }    
}

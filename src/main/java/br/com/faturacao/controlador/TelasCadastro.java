package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum TelasCadastro {
    
    PRODUTO("/cadastro_produto.jsp"),
    MATERIA_PRIMA("/cadastro_materiaprima.jsp"),
    FORNECEDOR("/cadastro_fornecedor.jsp"),
    FORMULACAO("/cadastro_formulacao.jsp");
    
    private final String url;
    
    TelasCadastro(String tela) {
        this.url = tela;
    }
    
    public String getTela () {
        return url;
    }
}

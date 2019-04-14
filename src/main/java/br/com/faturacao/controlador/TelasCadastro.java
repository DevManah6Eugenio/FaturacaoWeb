package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum TelasCadastro {
    
    PRODUTO("/cadastro/cadastro_produto.jsp"),
    MATERIA_PRIMA("/cadastro/cadastro_materiaprima.jsp"),
    FORNECEDOR("/cadastro/cadastro_fornecedor.jsp"),
    FORMULACAO("/cadastro/cadastro_formulacao.jsp");
    
    private final String url;
    
    TelasCadastro(String tela) {
        this.url = tela;
    }
    
    public String getTela () {
        return url;
    }
}

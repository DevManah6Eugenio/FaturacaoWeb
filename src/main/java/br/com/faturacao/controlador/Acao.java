package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum Acao {
    
    CADASTRAR("cadastrar"),
    EDITAR("editar"),
    CARREGAR("carregar"),
    LISTAR("listar"),
    DELETAR("deletar");
    
    private final String acao;
    
    Acao(String acao) {
        this.acao = acao;
    }
    
    public String getAcao(){
        return this.acao;
    }
}

package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum AcaoControlador {
    
    CADASTRAR("cadastrar"),
    EDITAR("editar"),
    CARREGAR("carregar"),
    LISTAR("listar"),
    DELETAR("deletar");
    
    private final String acao;
    
    AcaoControlador(String acao) {
        this.acao = acao;
    }
    
    public String getAcao(){
        return this.acao;
    }
}

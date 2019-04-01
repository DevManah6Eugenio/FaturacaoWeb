package br.com.faturacao.controlador;

/**
 *
 * @author manasses
 */
public enum Telas {

    //cadastro
    CADASTRO_PRODUTO(0),
    CADASTRO_MATERIA_PRIMA(1),
    CADASTRO_FORNECEDOR(2),
    CADASTRO_FORMULACAO(3),
    //consulta
    CONSULTA_PRODUTO(100),
    CONSULTA_MATERIA_PRIMA(101),
    CONSULTA_FORNECEDOR(102),
    CONSULTA_FORMULACAO(103);

    private final int valor;

    Telas(int tela) {
        valor = tela;
    }
    
    public int getTela() {
        return valor;
    }

    public static Telas getOpcao(int opcao) {
        switch (opcao) {
            
            //cadastro
            case 0:
                return Telas.CADASTRO_PRODUTO;
            case 1:
                return Telas.CADASTRO_MATERIA_PRIMA;
            case 2:
                return Telas.CADASTRO_FORNECEDOR;
            case 3:
                return Telas.CADASTRO_FORMULACAO;
                
            //consulta
            case 100:
                return Telas.CONSULTA_PRODUTO;
            case 101:
                return Telas.CONSULTA_MATERIA_PRIMA;
            case 102:
                return Telas.CONSULTA_FORNECEDOR;
            case 103:
                return Telas.CONSULTA_FORMULACAO;

            default:
                throw new IllegalArgumentException();
        }
    }
}

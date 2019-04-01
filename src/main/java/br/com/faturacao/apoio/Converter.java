package br.com.faturacao.apoio;

/**
 *
 * @author manasses
 */
public class Converter {
    public static int toInt(String valor){
        return !valor.equals("") ? Integer.parseInt(valor) : 0 ;
    };
    
    public static Double toDouble(String valor) {
        return !valor.equals("") ? Double.parseDouble(valor) : 0.0 ;
    };
}

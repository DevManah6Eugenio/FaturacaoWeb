package br.com.faturacao.dao;

import java.util.ArrayList;

/**
 *
 * @author manases
 * @param <T>
 */
public interface Dao <T> {
    
    public void salvar(T objeto);
    
    public void editar(T objeto);
    
    public void excluir(T objeto);
    
    public ArrayList<T> carregar(int primeiroResutlado, int ultimoResultado, T filtro);
}

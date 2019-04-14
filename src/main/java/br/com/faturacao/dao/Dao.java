package br.com.faturacao.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manases
 * @param <T>
 */
public interface Dao <T> {
    
    public void salvar(T objeto);
    
    public void editar(T objeto);
    
    public void excluir(T objeto);
    
    public List<T> listar(T filtro);
     
    public T carregar(T objeto);
}

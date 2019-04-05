package br.com.faturacao.bo;

import java.util.List;

/**
 *
 * @author manasses
 * @param <T>
 */
public interface BoInterface <T> {
    
    abstract void cadastrar(T obj);
    
    abstract void editar(T obj);

    abstract T carregar(T obj);

    abstract List<T> listar(T obj);

    abstract void deletar(T obj);    
}

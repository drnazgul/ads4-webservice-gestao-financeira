package br.senac.go.gestaofinanceirasenacv003.interfaces;

public interface IResource<T,N> extends GenericOperations<T,N> {

    void deleteByEntity(T entity);
}

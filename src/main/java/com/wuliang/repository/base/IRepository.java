package com.wuliang.repository.base;

public interface IRepository<T,ID> {
    void save(T entity);
    T findById(ID id);
    void deleteById(ID id);
}

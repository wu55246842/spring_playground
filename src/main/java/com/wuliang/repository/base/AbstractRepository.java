package com.wuliang.repository.base;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRepository <T,ID> implements IRepository<T,ID>{
   protected Map<ID,T> database = new HashMap<>();

    @Override
    public void save(T entity) {
        ID id = getId(entity);
        database.put(id, entity);
        System.out.println("Saved entity: " + entity);
    }

    @Override
    public T findById(ID id) {
        return database.get(id);
    }

    @Override
    public void deleteById(ID id) {
        database.remove(id);
        System.out.println("Deleted entity with id: " + id);
    }

    // 抽象方法，由子类实现以获取实体的 ID
    protected abstract ID getId(T entity);
}

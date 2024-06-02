package com.wuliang.repository;

import com.wuliang.repository.base.AbstractRepository;
import com.wuliang.repository.entity.User;

public class UserRepository extends AbstractRepository<User, Integer> {
    @Override
    protected Integer getId(User entity) {
        return entity.getId();
    }
}

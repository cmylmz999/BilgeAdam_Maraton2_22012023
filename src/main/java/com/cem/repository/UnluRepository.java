package com.cem.repository;

import com.cem.entity.Unlu;

public class UnluRepository extends RepositoryManager<Unlu,Long> {
    public UnluRepository() {
        super(new Unlu());
    }
}

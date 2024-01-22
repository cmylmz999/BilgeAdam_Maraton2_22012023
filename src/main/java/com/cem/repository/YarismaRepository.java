package com.cem.repository;


import com.cem.entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma,Long> {
    public YarismaRepository() {
        super(new Yarisma());
    }
}

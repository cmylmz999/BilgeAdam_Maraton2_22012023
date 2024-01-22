package com.cem.repository;

import com.cem.entity.Yarismaci;

public class YarismaciRepository extends RepositoryManager<Yarismaci,Long> {
    public YarismaciRepository() {
        super(new Yarismaci());
    }
}

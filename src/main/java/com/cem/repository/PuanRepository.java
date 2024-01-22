package com.cem.repository;


import com.cem.entity.Puan;

public class PuanRepository extends RepositoryManager<Puan,Long> {
    public PuanRepository() {
        super(new Puan());
    }
}

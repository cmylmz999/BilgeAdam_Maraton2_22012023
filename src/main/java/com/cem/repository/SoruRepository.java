package com.cem.repository;


import com.cem.entity.Soru;

public class SoruRepository extends RepositoryManager<Soru,Long> {
    public SoruRepository() {
        super(new Soru());
    }
}

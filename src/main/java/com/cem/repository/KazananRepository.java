package com.cem.repository;

import com.cem.entity.Kazananlar;

public class KazananRepository extends RepositoryManager<Kazananlar,Long> {
    public KazananRepository() {
        super(new Kazananlar());
    }

}

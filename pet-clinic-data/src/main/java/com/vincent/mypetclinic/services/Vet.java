package com.vincent.mypetclinic.services;

import java.util.Set;

public interface Vet {
    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

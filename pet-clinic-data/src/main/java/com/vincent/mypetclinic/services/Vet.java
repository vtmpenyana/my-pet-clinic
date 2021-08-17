package com.vincent.mypetclinic.services;


public interface Vet extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);
}

package com.vincent.mypetclinic.services;

import com.vincent.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}

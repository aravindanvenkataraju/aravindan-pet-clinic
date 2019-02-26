package com.aravindan.springframework.petclinic.services;

import java.util.Set;

import com.aravindan.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
	
}

package com.aravindan.springframework.petclinic.services;

import java.util.Set;

import com.aravindan.springframework.petclinic.model.Owner;
import com.aravindan.springframework.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
	Vet findByLastName(String lastName);
}

package com.aravindan.springframework.petclinic.services;

import java.util.Set;

import com.aravindan.springframework.petclinic.model.Owner;
import com.aravindan.springframework.petclinic.model.Vet;

public interface VetService {
	Vet findByLastName(String lastName);

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> finaAll();

}

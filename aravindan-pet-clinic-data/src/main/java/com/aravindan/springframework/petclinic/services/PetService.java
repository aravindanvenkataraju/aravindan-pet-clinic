package com.aravindan.springframework.petclinic.services;

import java.util.Set;

import com.aravindan.springframework.petclinic.model.Owner;
import com.aravindan.springframework.petclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> finaAll();

}

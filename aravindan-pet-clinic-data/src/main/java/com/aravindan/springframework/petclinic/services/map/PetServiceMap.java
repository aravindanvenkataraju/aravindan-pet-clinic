package com.aravindan.springframework.petclinic.services.map;

import com.aravindan.springframework.petclinic.model.Pet;
import com.aravindan.springframework.petclinic.model.Vet;
import com.aravindan.springframework.petclinic.services.CrudService;
import com.aravindan.springframework.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}

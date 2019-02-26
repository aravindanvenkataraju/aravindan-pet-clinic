package com.aravindan.springframework.petclinic.services.map;

import com.aravindan.springframework.petclinic.model.Pet;
import com.aravindan.springframework.petclinic.model.Vet;
import com.aravindan.springframework.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}

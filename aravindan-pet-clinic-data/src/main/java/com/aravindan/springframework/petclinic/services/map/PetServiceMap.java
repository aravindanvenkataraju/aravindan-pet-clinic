package com.aravindan.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.aravindan.springframework.petclinic.model.Pet;
import com.aravindan.springframework.petclinic.services.PetService;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

}

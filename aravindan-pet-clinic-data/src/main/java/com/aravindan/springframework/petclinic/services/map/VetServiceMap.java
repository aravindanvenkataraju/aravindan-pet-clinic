package com.aravindan.springframework.petclinic.services.map;

import com.aravindan.springframework.petclinic.model.Vet;
import com.aravindan.springframework.petclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Vet findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}

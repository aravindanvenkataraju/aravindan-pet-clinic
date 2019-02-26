package com.aravindan.springframework.petclinic.services.map;

import com.aravindan.springframework.petclinic.model.Vet;
import com.aravindan.springframework.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

}

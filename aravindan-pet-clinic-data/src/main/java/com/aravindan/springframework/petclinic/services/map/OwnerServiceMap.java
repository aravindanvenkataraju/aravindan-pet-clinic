package com.aravindan.springframework.petclinic.services.map;

import com.aravindan.springframework.petclinic.model.Owner;
import com.aravindan.springframework.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

}

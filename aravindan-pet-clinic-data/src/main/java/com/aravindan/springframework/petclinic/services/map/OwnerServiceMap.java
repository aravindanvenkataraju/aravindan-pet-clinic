package com.aravindan.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.aravindan.springframework.petclinic.model.Owner;
import com.aravindan.springframework.petclinic.services.OwnerService;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}

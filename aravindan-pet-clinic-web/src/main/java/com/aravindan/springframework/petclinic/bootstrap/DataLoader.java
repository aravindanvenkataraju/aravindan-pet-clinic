package com.aravindan.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aravindan.springframework.petclinic.model.Owner;
import com.aravindan.springframework.petclinic.model.Vet;
import com.aravindan.springframework.petclinic.services.OwnerService;
import com.aravindan.springframework.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Aravindan");
		owner1.setLastName("Venkataraju");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Kamal");
		owner2.setLastName("Hassan");
		ownerService.save(owner2);
		
		System.out.println("Owners Loaded...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Vikram");
		vet1.setLastName("Kenny");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Vijay");
		vet2.setLastName("Ilayathalapathy");
		vetService.save(vet2);
		
		System.out.println("Vets Loaded...");


	}

}

package com.project.phase4endprojectpetclinic.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.phase4endprojectpetclinic.entity.Owner;
import com.project.phase4endprojectpetclinic.entity.Pet;
import com.project.phase4endprojectpetclinic.entity.Visit;
import com.project.phase4endprojectpetclinic.repo.OwnerRepository;
import com.project.phase4endprojectpetclinic.repo.PetRepository;
import com.project.phase4endprojectpetclinic.repo.VisitRepository;

@Service
public class ClinicService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private VisitRepository visitRepository;

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    public Visit saveVisit(Visit visit) {
        return visitRepository.save(visit);
    }
    public Owner getOwnerById(Long ownerId) {
        return ownerRepository.findById(ownerId).orElse(null); // Fetch owner by ID
    }
    public Pet getPetById(Long petId) {
        return petRepository.findById(petId).orElse(null); // Fetch pet by ID
    }

	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}
	public List<Visit> getAllVisits() {
		return visitRepository.findAll();
	}
	
}

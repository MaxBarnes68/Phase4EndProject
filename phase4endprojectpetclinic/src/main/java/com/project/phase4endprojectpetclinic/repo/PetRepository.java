package com.project.phase4endprojectpetclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.phase4endprojectpetclinic.entity.Pet;

public interface PetRepository  extends JpaRepository<Pet, Long>  {

}

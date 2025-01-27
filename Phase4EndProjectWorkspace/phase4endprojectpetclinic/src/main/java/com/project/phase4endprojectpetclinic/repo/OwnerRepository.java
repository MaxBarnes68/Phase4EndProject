package com.project.phase4endprojectpetclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.phase4endprojectpetclinic.entity.Owner;

public interface OwnerRepository  extends JpaRepository<Owner, Long> {

}

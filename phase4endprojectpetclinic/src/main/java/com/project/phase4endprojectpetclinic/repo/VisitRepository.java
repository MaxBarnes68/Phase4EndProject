package com.project.phase4endprojectpetclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.phase4endprojectpetclinic.entity.Visit;

public interface VisitRepository  extends JpaRepository<Visit, Long> {

}

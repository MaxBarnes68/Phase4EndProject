package com.project.phase4endprojectpetclinic.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate visitDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

	public Visit() {
		super();
	}

	public Visit(Long id, LocalDate visitDate, String description, Pet pet) {
		super();
		this.id = id;
		this.visitDate = visitDate;
		this.description = description;
		this.pet = pet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Visit [id=" + id + ", visitDate=" + visitDate + ", description=" + description + ", pet=" + pet + "]";
	}
    
    
}

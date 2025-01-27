package com.project.phase4endprojectpetclinic.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.phase4endprojectpetclinic.entity.Owner;
import com.project.phase4endprojectpetclinic.entity.Pet;
import com.project.phase4endprojectpetclinic.entity.Visit;
import com.project.phase4endprojectpetclinic.service.ClinicService;

@Controller
@RequestMapping("/")
public class ClinicController {

    @Autowired
    private ClinicService clinicService;

    // Home Page
    @GetMapping("/")
    public String showHomePage() {
        return "home"; // This will render home.jsp
    }


    // View all Owners
    @GetMapping("/owners")
    public String getOwners(Model model) {
        List<Owner> owners = clinicService.getAllOwners();
        model.addAttribute("owners", owners);
        return "owners"; // This will render owners.jsp
    }

    // View all Pets
    @GetMapping("/pets")
    public String getPets(Model model) {
        List<Pet> pets = clinicService.getAllPets();
        model.addAttribute("pets", pets);
        return "pets"; // This will render pets.jsp
    }

    // View all Visits
    @GetMapping("/visits")
    public String getVisits(Model model) {
        List<Visit> visits = clinicService.getAllVisits();
        model.addAttribute("visits", visits);
        return "visits"; // This will render visits.jsp
    }

    // Add Owner Form
    @GetMapping("/addOwner")
    public String showAddOwnerPage() {
        return "addOwner"; // This will render addOwner.jsp
    }

    // Add Pet Form
    @GetMapping("/addPet")
    public String showAddPetPage() {
        return "addPet"; // This will render addPet.jsp
    }

    // Add Visit Form
    @GetMapping("/addVisit")
    public String showAddVisitPage(Model model) {
        List<Pet> pets = clinicService.getAllPets(); // Add a list of pets to the model
        model.addAttribute("pets", pets);
        return "addVisit"; // This will render addVisit.jsp
    }

    // Handle Adding a Visit
    @PostMapping("/addVisit")
    public String addVisit(@RequestParam LocalDate visitDate, @RequestParam String description, @RequestParam Long petId) {
        Pet pet = clinicService.getPetById(petId); // Get pet by ID
        Visit visit = new Visit();
        visit.setVisitDate(visitDate); // Set visit date
        visit.setDescription(description); // Set description
        visit.setPet(pet); // Set associated pet
        clinicService.saveVisit(visit); // Save the visit
        return "redirect:/visits"; // Redirect to visits page after successful creation
    }

    // Handle Adding an Owner
    @PostMapping("/addOwner")
    public String addOwner(@RequestParam String name, @RequestParam String address, @RequestParam String phone) {
        Owner owner = new Owner();
        owner.setName(name);
        owner.setAddress(address);
        owner.setPhone(phone);
        clinicService.saveOwner(owner);
        return "redirect:/owners"; // Redirect to owners page after successful creation
    }

    // Handle Adding a Pet
    @PostMapping("/addPet")
    public String addPet(@RequestParam String name, @RequestParam String type, @RequestParam Long ownerId) {
        Pet pet = new Pet();
        pet.setName(name);
        pet.setType(type);
        pet.setOwner(clinicService.getOwnerById(ownerId)); // Set associated owner
        clinicService.savePet(pet);
        return "redirect:/pets"; // Redirect to pets page after successful creation
    }
}

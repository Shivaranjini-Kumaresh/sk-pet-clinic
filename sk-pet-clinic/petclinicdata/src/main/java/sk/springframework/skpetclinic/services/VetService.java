package sk.springframework.skpetclinic.services;

import sk.springframework.skpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();

}

package sk.springframework.skpetclinic.services.impl;

import sk.springframework.skpetclinic.model.Owner;
import sk.springframework.skpetclinic.model.Vet;
import sk.springframework.skpetclinic.services.CrudService;
import sk.springframework.skpetclinic.services.map.AbstractMapService;

import java.util.Set;

public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {


    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(),vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}

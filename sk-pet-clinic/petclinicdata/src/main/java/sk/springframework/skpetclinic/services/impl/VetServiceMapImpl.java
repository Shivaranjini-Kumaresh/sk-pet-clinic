package sk.springframework.skpetclinic.services.impl;

import org.springframework.stereotype.Service;
import sk.springframework.skpetclinic.model.Vet;
import sk.springframework.skpetclinic.services.VetService;
import sk.springframework.skpetclinic.services.map.AbstractMapService;

import java.util.Set;

@Service
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService {


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

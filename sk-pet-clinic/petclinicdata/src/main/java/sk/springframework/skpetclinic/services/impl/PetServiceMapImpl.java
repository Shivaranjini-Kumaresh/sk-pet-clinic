package sk.springframework.skpetclinic.services.impl;

import org.springframework.stereotype.Service;
import sk.springframework.skpetclinic.model.Pet;
import sk.springframework.skpetclinic.services.PetService;
import sk.springframework.skpetclinic.services.map.AbstractMapService;

import java.util.Set;

@Service
public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements PetService {


    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}

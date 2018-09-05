package sk.springframework.skpetclinic.services.impl;

import org.springframework.stereotype.Service;
import sk.springframework.skpetclinic.model.Owner;
import sk.springframework.skpetclinic.services.OwnerService;
import sk.springframework.skpetclinic.services.map.AbstractMapService;

import java.util.Set;

@Service
public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

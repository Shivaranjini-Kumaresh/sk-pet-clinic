package sk.springframework.skpetclinic.services;

import sk.springframework.skpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

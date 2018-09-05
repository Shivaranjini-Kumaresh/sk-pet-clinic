package sk.springframework.skpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sk.springframework.skpetclinic.model.Owner;
import sk.springframework.skpetclinic.model.Vet;
import sk.springframework.skpetclinic.services.OwnerService;
import sk.springframework.skpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService){

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstname("Shiva");
        owner.setLastname("Kumaresh");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstname("Ranjini");
        owner1.setLastname("Kumaresh");

        ownerService.save(owner1);

        System.out.println("Loading Owners....");
        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstname("vet");
        vet.setLastname("Kumaresh");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstname("vet");
        vet1.setLastname("Shiva");

        vetService.save(vet1);
        System.out.println("Loading Vets....");

    }
}

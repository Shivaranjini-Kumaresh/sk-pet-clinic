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
        owner.setFirstName("Shiva");
        owner.setLastName("Kumaresh");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Ranjini");
        owner1.setLastName("Kumaresh");

        ownerService.save(owner1);

        System.out.println("Loading Owners....");
        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("vet");
        vet.setLastName("Kumaresh");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("vet");
        vet1.setLastName("Shiva");

        vetService.save(vet1);
        System.out.println("Loading Vets....");

    }
}

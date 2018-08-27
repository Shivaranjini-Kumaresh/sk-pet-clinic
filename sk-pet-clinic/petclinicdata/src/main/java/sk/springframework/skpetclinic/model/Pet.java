package sk.springframework.skpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity{

	private PetType petType;
	private Person owner;
	private LocalDate birthDate;

}

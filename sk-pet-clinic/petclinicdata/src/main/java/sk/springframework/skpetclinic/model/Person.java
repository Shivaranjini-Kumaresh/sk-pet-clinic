package sk.springframework.skpetclinic.model;

import lombok.Data;

@Data
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

}

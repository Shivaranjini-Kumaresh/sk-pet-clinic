package sk.springframework.skpetclinic.model;

import lombok.Data;

@Data
public class Person extends BaseEntity {

    private String firstname;
    private String lastname;

}

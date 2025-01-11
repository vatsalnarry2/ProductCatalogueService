package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Setter;

@Entity(name="st_instructor")
@Setter
@DiscriminatorValue(value="1")
public class Instructor extends User{

	String companies;
}

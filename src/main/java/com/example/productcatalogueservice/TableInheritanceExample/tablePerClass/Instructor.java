package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name="tpc_instructor")
@Setter
@Getter
public class Instructor extends User{

	String companies;
}

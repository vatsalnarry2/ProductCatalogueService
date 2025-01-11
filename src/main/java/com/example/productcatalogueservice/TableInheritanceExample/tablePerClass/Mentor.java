package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass;

import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name="tpc_mentor")
@Setter
@Getter
class Mentor extends User {
	Double rating;

}

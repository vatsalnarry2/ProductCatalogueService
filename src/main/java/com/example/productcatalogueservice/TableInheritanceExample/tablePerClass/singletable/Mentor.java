package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.singletable;

import java.util.UUID;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name="st_mentor")
@Setter
@Getter
@DiscriminatorValue(value="3")
class Mentor extends User {
	Double rating;

}

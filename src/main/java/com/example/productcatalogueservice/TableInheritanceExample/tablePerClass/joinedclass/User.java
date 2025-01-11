package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.joinedclass;

import java.util.UUID;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Entity(name="jc_user")
@Setter
@Getter
@Inheritance(strategy =InheritanceType.JOINED )

public class User {
	@Id
	UUID uuid;

	String email;
}

package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.singletable;

import java.util.UUID;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Entity(name="st_user")
@Setter
@Getter
@Inheritance(strategy =InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name="user_type",discriminatorType = DiscriminatorType.INTEGER)
public class User {
	@Id
	UUID uuid;

	String email;
}

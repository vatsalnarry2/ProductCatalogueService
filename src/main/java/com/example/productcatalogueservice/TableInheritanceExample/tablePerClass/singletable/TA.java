package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.singletable;

import java.util.UUID;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name="st_ta")
@Setter
@Getter
@DiscriminatorValue(value="2")
public class TA extends User {
	
	Integer helpRequet;
	

}

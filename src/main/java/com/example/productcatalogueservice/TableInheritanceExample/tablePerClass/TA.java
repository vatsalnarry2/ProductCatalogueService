package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass;

import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name="tpc_ta")
@Setter
@Getter
public class TA extends User {
	
	Integer helpRequet;
	

}

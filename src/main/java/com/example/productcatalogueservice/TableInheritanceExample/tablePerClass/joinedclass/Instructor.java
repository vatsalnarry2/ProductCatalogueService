package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name="jc_instructor")
@Setter
@Getter
@PrimaryKeyJoinColumn(name="user_id")
public class Instructor extends User{

	String companies;
}

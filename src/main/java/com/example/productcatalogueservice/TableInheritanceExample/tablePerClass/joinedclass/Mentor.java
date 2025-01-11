package com.example.productcatalogueservice.TableInheritanceExample.tablePerClass.joinedclass;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name="jc_mentor")
@Setter
@Getter
@PrimaryKeyJoinColumn(name="user_id")
class Mentor extends User {
	Double rating;

}

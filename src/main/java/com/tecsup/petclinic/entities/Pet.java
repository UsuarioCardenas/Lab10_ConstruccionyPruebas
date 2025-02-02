package com.tecsup.petclinic.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * 
 * @author jgomezm
 *
 */
@Entity(name = "pets")
@Data
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@Column(name = "type_id")
	private int typeId;

	@Column(name = "owner_id")
	private int ownerId;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birth_date")
	private Date birthDate;

	public Pet() {
	}

	public Pet(Integer id, String name, int typeId, int ownerId, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.typeId = typeId;
		this.ownerId = ownerId;
		this.birthDate = birthDate;
	}

	public Pet(String name, int typeId, int ownerId, Date birthDate) {
		super();
		this.name = name;
		this.typeId = typeId;
		this.ownerId = ownerId;
		this.birthDate = birthDate;
	}

	public Pet(String name, int typeId, int ownerId) {
		super();
		this.name = name;
		this.typeId = typeId;
		this.ownerId = ownerId;
	}
}
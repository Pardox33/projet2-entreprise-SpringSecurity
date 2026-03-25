package com.nadia.entreprises.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Secteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSec;
	private String nomSec;
	
	@OneToMany(mappedBy = "secteur")
	private List<Entreprise> entreprises ;
}
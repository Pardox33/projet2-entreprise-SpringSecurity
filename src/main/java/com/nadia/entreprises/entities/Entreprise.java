package com.nadia.entreprises.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Entreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnt;

    @NotBlank(message = "Le nom de l'entreprise est obligatoire")
    @Size(min = 2, max = 50, message = "Le nom doit contenir entre 2 et 50 caractères")
    private String nomEnt;

    @NotNull(message = "Le chiffre d'affaires est obligatoire")
    @Min(value = 0, message = "Le chiffre d'affaires ne peut pas être négatif")
    private Double chiffreAff;

    @NotNull(message = "La date de création est obligatoire")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "La date de création doit être dans le passé ou aujourd'hui")
    private Date dateCre;

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit être valide")
    private String email;
	

	@ManyToOne(optional=true)
	private Secteur secteur;
	

	public Entreprise() {
		super();
	}
	
	public Entreprise(String nomEnt, Double chiffreAff, Date dateCre, String email) {
		super();
		this.nomEnt = nomEnt;
		this.chiffreAff = chiffreAff;
		this.dateCre = dateCre;
		this.email = email;
	}

	public Long getIdEnt() {
		return idEnt;

	} 
	public void setIdEnt(Long idEnt) {
		this.idEnt = idEnt;
	}
	public String getNomEnt() {
		return nomEnt;
	}
	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}
	public Double getChiffreAff() {
		return chiffreAff;
	}
	public void setChiffreAff(Double chiffreAff) {
		this.chiffreAff = chiffreAff;
	}
	public Date getDateCre() {
		return dateCre;
	}
	public void setDateCre(Date dateCre) {
		this.dateCre = dateCre;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "entreprise [idEnt=" + idEnt + ", nomEnt=" + nomEnt + ", chiffreAff=" + chiffreAff + ", dateCre="
				+ dateCre + ", email=" + email + "]";
	}


	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	
}

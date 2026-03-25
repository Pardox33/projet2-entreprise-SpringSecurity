package com.nadia.entreprises.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.entities.Secteur;
import com.nadia.entreprises.repos.EntrepriseRepository;
import com.nadia.entreprises.repos.SecteurRepository;

@Service
public class EntrepriseServiceImp implements EntrepriseService{
	@Autowired
	EntrepriseRepository entrepriseRepository;
	
	@Autowired
	SecteurRepository secteurRepository;
	
	@Override
	public Entreprise saveEntreprise(Entreprise e) {
		return entrepriseRepository.save(e);
	}

	@Override
	public Entreprise updateEntreprise(Entreprise e) {
		return entrepriseRepository.save(e);
	}

	@Override
	public void deleteEntreprise(Entreprise e) {
		entrepriseRepository.delete(e);
	}

	@Override
	public void deleteEntrepriseById(Long id) {
		entrepriseRepository.deleteById(id);
	}

	@Override
	public Entreprise getEntreprise(Long id) {
		return entrepriseRepository.findById(id).get();
	}

	@Override
	public List<Entreprise> getAllEntreprises() {
		return entrepriseRepository.findAll();
	}

	@Override
	public Page<Entreprise> getAllEntreprisesParPage(int page, int size) {
		return entrepriseRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Entreprise> findByNomEnt(String nom) {
		return entrepriseRepository.findByNomEnt(nom);
	}

	@Override
	public List<Entreprise> findByNomEntContains(String nom) {
		return entrepriseRepository.findByNomEntContains(nom);
	}

	@Override
	public List<Entreprise> findByChiffreAff(String nom, Double chiffreAff) {
		return entrepriseRepository.findByChiffreAff(nom,chiffreAff);
	}

	@Override
	public List<Entreprise> findBySecteur(Secteur secteur) {
		return entrepriseRepository.findBySecteur(secteur);
	}

	@Override
	public List<Entreprise> findBySecteurIdSec(Long id) {
		return entrepriseRepository.findBySecteurIdSec(id);
	}

	@Override
	public List<Entreprise> findByOrderByNomEntAsc() {
		return entrepriseRepository.findByOrderByNomEntAsc();
	}

	@Override
	public List<Entreprise> trierEntreprisesNomsChiffre() {
		return entrepriseRepository.trierEntreprisesNomsChiffre();
	}

	@Override
	public List<Secteur> getAllSecteur() {
		return secteurRepository.findAll() ;
	}

}

package com.nadia.entreprises.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nadia.entreprises.entities.Entreprise;
import com.nadia.entreprises.entities.Secteur;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

    List<Entreprise> findByNomEnt(String nom);
    List<Entreprise> findByNomEntContains(String nom);

    @Query("select e from Entreprise e where e.nomEnt like %:nom and e.chiffreAff > :chiffreAffaire")
    List<Entreprise> findByChiffreAff(@Param("nom") String nom,
                                      @Param("chiffreAffaire") Double chiffreAffaire);

    @Query("select e from Entreprise e where e.secteur = ?1")
    List<Entreprise> findBySecteur(Secteur secteur);

    List<Entreprise> findBySecteurIdSec(Long id);

    List<Entreprise> findByOrderByNomEntAsc();

    @Query("select e from Entreprise e order by e.nomEnt ASC, e.chiffreAff DESC")
    List<Entreprise> trierEntreprisesNomsChiffre();
}
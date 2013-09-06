package fr.treeptik.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.entity.Commande;

public interface CommandeDao extends JpaRepository<Commande, Integer> {

	@Query("select c from Commande c where c.dateCommande=:dateCommande")
	public Commande findByDateCommande(@Param("dateCommande") Date date);
	
	@Query("select c from Commande c where c.dateLivraison=:dateLivraison")
	public List<Commande> findAllByDateLivraison(@Param("dateLivraison") Date dateLivraison);
}

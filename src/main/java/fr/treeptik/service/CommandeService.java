package fr.treeptik.service;

import java.util.List;

import fr.treeptik.entity.Commande;
import fr.treeptik.exception.ServiceException;

public interface CommandeService {
	
	Commande add(Commande commande) throws ServiceException;
    List<Commande> getAll() throws ServiceException;
    Commande get(Integer id) throws ServiceException;
    void delete(Integer id) throws ServiceException;

}

package fr.treeptik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.CommandeDao;
import fr.treeptik.entity.Commande;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.service.CommandeService;

@Service
public class CommandeServiceImpl implements CommandeService {
	
	@Autowired
	private CommandeDao commandeDao;

	@Override
	@Transactional
	public Commande add(Commande commande) throws ServiceException {
		
		commandeDao.save(commande);
		
		return commande;
		
		
	}

	@Override
	public List<Commande> getAll() throws ServiceException {
	
		return commandeDao.findAll();
	}

	@Override
	public Commande get(Integer id) throws ServiceException {
		
		return commandeDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws ServiceException {
		
		commandeDao.delete(id);
		
	}

}

package fr.treeptik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.ProductDao;
import fr.treeptik.entity.Product;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	@Transactional
	public Product add(Product product) throws ServiceException {
		productDao.save(product);
		
		return product;
		
	}

	@Override
	public List<Product> getAll() throws ServiceException {
		
		return productDao.findAll();
	}

	@Override
	public Product get(Integer id) throws ServiceException {
	
		return productDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws ServiceException {
		
		productDao.delete(id);
		
	}

}

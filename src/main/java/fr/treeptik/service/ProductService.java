package fr.treeptik.service;

import java.util.List;

import fr.treeptik.entity.Product;
import fr.treeptik.exception.ServiceException;

public interface ProductService {
	
	Product add(Product product) throws ServiceException;
	List<Product> getAll() throws ServiceException;
	Product get(Integer id) throws ServiceException;
	void delete(Integer id) throws ServiceException;

}

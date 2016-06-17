package product.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import product.dao.ProductDAO;
import product.dto.ProductDTO;



@Service
public class ProductServiceImpl implements ProductService {
@Autowired
@Qualifier("prddao")
	ProductDAO dao;
	
	@Override
	public ArrayList<ProductDTO> productlist(String category) {
		return dao.productlist(category);
	}

	@Override
	public ArrayList<ProductDTO> searchTopProduct() {
		return dao.searchTopProduct();
	}


}

package product.dao;


import java.util.ArrayList;

import product.dto.ProductDTO;

public interface ProductDAO {
	ArrayList<ProductDTO> productlist (String category);
	ArrayList<ProductDTO> searchTopProduct();

}



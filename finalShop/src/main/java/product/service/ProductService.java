package product.service;

import java.util.ArrayList;

import product.dto.ProductDTO;

public interface ProductService {
	
	ArrayList<ProductDTO> productlist(String category);	//ProductDAOImpl�� productlist()�� ȣ���ϴ� �޼ҵ�
	ArrayList<ProductDTO> searchTopProduct();
}

package product.dao;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import product.dto.ProductDTO;
import product.dto.ProductRowMapper;
import product.dto.ProductRowMapper2;

@Repository("prddao")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public ArrayList<ProductDTO> productlist(String category) {
		
		return (ArrayList<ProductDTO>)template.query("select * from tb_product", new ProductRowMapper());
	}

	@Override
	public ArrayList<ProductDTO> searchTopProduct() {
		//select a.prd_nm, a.img_gen_file_nm from tb_product a, top_prd b where a.prd_no = b.prd_no
		return (ArrayList<ProductDTO>) template.query("select a.prd_nm, a.img_gen_file_nm from tb_product a, top_prd b where a.prd_no = b.prd_no", new ProductRowMapper2());
	}
}

package product.dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper2 implements RowMapper<ProductDTO> {

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		ProductDTO prd = new ProductDTO(rs.getString(1),
				rs.getString(2));
		return prd;
	}
	
 

}

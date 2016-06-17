package fw;


//SQL만 정의하는 클래스 > 프레임워크 기반으로 작업을 하면 설정파일 (XML)로 변경이 가능.


public class Query {
	public static String PRDLIST_SQL
					= "select * from tb_product";
	
	public static String PRDLIST_CTG
					= "select * from tb_product where category_no=?";
	
	public static String SEARCH_TOP
					= "select a.prd_nm, a.img_gen_file_nm from tb_product a, top_prd b where a.prd_no = b.prd_no";

	public static String MEM_LOGIN
					= "select mem_id, pwd from tb_mem where mem_id = ? and pwd = ?";

	
}


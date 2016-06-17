package transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionBasicTest {
	public static void main(String[] args) {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "scott";
			String password = "TIGER";
			String sql ="";
			Connection con =null;
			PreparedStatement ptmt =null;
		
			
			boolean state = false; //현재 상태값
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(url, user, password);
				
				con.setAutoCommit(false);
				sql = "insert into myemp values ('444','1111','1111',1000,'111','001','1111')";
				ptmt = con.prepareStatement(sql);
				ptmt.executeUpdate();
	

				sql = "insert into myemp values ('55','2222','2222',1000,'222','002','1111')";
				ptmt = con.prepareStatement(sql);
				ptmt.executeUpdate();

				sql = "insert in myemp values ('25343','3333','3333',1000,'333','003','1111')";
				ptmt = con.prepareStatement(sql);
				ptmt.executeUpdate();
				state = true;
				System.out.println("삽입 성공");
				
			}catch(ClassNotFoundException e){
				System.out.println("드라이버로딩 실패");
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(state){
						con.commit();
					}else{
						con.rollback();
						System.out.println("sss");
					}
					
					if(ptmt!=null)ptmt.close();
					if(con!=null)con.close();
					
				}catch (Exception e) {
						e.printStackTrace();
						System.out.println("sdsdv");
					}
				}
			}
		

	

}

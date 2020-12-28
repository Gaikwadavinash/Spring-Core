package com.nt.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import com.nt.bo.ProductBo;
public class ProductDAOImpl implements IProductDAO {
private String insert_Query_Product
="INSERT INTO SP_ASS3_PRODUCT VALUES(PROD_NO.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;
	public ProductDAOImpl(DataSource ds) {
	this.ds = ds;
}

public int insert(ProductBo bo) throws Exception {
//JDBC Code
	
Connection con=ds.getConnection();
PreparedStatement ps=con.prepareStatement(insert_Query_Product);
ps.setString(1,bo.getpName());
ps.setString(2, bo.getType());
ps.setFloat(3,(bo.getBasePrice()));
ps.setString(4, bo.getStatus());
ps.setInt(5,bo.getQty());
ps.setFloat(6, bo.getMrp());
int count=ps.executeUpdate();
con.close();
		return count;
	}

}

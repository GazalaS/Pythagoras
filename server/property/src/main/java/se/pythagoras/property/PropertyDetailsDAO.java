package se.pythagoras.property;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PropertyDetailsDAO {

	   public List<PropertyDetails> listAll() {
	        List<PropertyDetails> list = new ArrayList<PropertyDetails>();
	        Connection c = null;
	    	String sql = "SELECT * FROM propertyDetails ORDER BY floorName";
	        try {
	            c = ConnectionHelper.getConnection();
	            Statement s = c.createStatement();
	            ResultSet rs = s.executeQuery(sql);
	            while (rs.next()) {
	                list.add(processRow(rs));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
			} finally {
				ConnectionHelper.close(c);
			}
	        return list;
	    }

	   protected PropertyDetails processRow(ResultSet rs) throws SQLException {
		   PropertyDetails propertyDetails = new PropertyDetails();
	       propertyDetails.setFloorName(rs.getString("floorName"));
	       propertyDetails.setFloorArea(rs.getString("floorArea"));
	       propertyDetails.setBuildingName(rs.getString("buildingName"));
	       return propertyDetails;
	    }
	   
}

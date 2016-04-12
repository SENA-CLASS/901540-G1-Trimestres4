package beans;

import dao.Database;
import java.sql.*;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author javaknowledge
 */
@ManagedBean
@SessionScoped
public class TableBean {

    private String imageID;
    private String imageName;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageLength() {
        return imageLength;
    }

    public void setImageLength(String imageLength) {
        this.imageLength = imageLength;
    }
    private String imageLength;

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }
    Connection MySQLcon = null;
    Statement stmt = null;
    PreparedStatement ps;
    ResultSet rs;

    public List<TableBean> getAllImage() {
        List<TableBean> imageInfo = new ArrayList<TableBean>();
        Connection con = Database.getConnection();
        try {
            stmt = con.createStatement();
            String strSql = "select image_id,Image_name from upload_image order by image_id ";
            //System.err.println("*select all***" + strSql);
            rs = stmt.executeQuery(strSql);
            while (rs.next()) {
                TableBean tbl = new TableBean();
                tbl.setImageID(rs.getString("image_id"));
                tbl.setImageName(rs.getString("Image_name"));
                imageInfo.add(tbl);
            }
        } catch (SQLException e) {
            System.out.println("Exception in getAllImage::" + e.getMessage());
        }
        return imageInfo;
    }
}
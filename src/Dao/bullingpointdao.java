/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.bullingpoints;
import dao.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class bullingpointdao {
    public List<bullingpoints> getAllbullingpoints(){
        List<bullingpoints> sl_chung = new ArrayList<>();
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from tblbullingpoint";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                bullingpoints bullingpoint = new bullingpoints();
                bullingpoint.setProdid(rs.getString("PRODID"));
                bullingpoint.setProdname(rs.getString("PRODNAME"));
                bullingpoint.setProdqty(rs.getString("PRODQTY"));
                bullingpoint.setProdprice(rs.getString("PRODPRICE"));
                bullingpoint.setProdcat(rs.getString("PRODCAT"));
                sl_chung.add(bullingpoint);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sl_chung;  
    }
    
    public bullingpoints getbullingpointById(String id){
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from data where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                bullingpoints bullingpoint = new bullingpoints();
                bullingpoint.setProdid(rs.getString("PRODID"));
                bullingpoint.setProdname(rs.getString("PRODNAME"));
                bullingpoint.setProdqty(rs.getString("PRODQTY"));
                bullingpoint.setProdprice(rs.getString("PRODPRICE"));
                bullingpoint.setProdcat(rs.getString("PRODCAT"));
                return bullingpoint;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void updateBullingpoint(bullingpoints bullingpoint) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "UPDATE tblbullingpoint SET PRODID = ?,PRODNAME = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, bullingpoint.getProdqty());
            pstmt.setString(2, bullingpoint.getProdname());
            int rs = pstmt.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

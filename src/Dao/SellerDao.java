/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Sellers;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class SellerDao {
    public List<Sellers> getAllSellers(){
        List<Sellers> sl_diem_117 = new ArrayList<Sellers>();
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from seller";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sellers seller_117 = new Sellers();
                seller_117.setId(rs.getString("idSeller"));
                seller_117.setName(rs.getString("name"));
                seller_117.setPassword(rs.getString("password"));
                seller_117.setGender(rs.getString("gender"));
                sl_diem_117.add(seller_117);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sl_diem_117;  
    }
    public Sellers getSellerById(String id){
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from data where idSeller = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sellers seller_117 = new Sellers();
                seller_117.setId(rs.getString("idSeller"));
                seller_117.setName(rs.getString("name"));
                seller_117.setPassword(rs.getString("password"));
                seller_117.setGender(rs.getString("gender"));
                return seller_117;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void addSeller(Sellers seller) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "INSERT INTO seller (idSeller, name, password, gender) VALUES(?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, seller.getId());
            pstmt.setString(2, seller.getName());
            pstmt.setString(3, seller.getPassword());
            pstmt.setString(4, seller.getGender());
            

            int rs = pstmt.executeUpdate();
            System.out.println(rs);
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void editSeller(Sellers seller) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();

        String sql = "UPDATE seller SET idSeller = ?,name = ?,password = ?, gender = ?";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, seller.getId());
            pstmt.setString(2, seller.getName());
            pstmt.setString(3, seller.getPassword());
            pstmt.setString(4, seller.getGender());
            int rs = pstmt.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteSeller(String id) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();

        String sql = "delete from seller where idSeller= ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }
}

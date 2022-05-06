/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Sellers;
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
        List<Sellers> sl_diem = new ArrayList<Sellers>();
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from seller";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sellers seller = new Sellers();
                seller.setId(rs.getInt("ID"));
                seller.setName(rs.getString("NAME"));
                seller.setPassword(rs.getString("PASSWORD"));
                seller.setGender(rs.getString("GENDER"));
                sl_diem.add(seller);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sl_diem;  
    }
    public Sellers getSellerById(int id){
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from data where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sellers seller = new Sellers();
                seller.setId(rs.getInt("ID"));
                seller.setName(rs.getString("NAME"));
                seller.setPassword(rs.getString("PASSWORD"));
                seller.setGender(rs.getString("GENDER"));
                return seller;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void addSeller(Sellers seller) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "INSERT INTO seller (ID, NAME, PASSWORD, GENDER) VALUES(?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, seller.getId());
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
        String sql = "UPDATE seller SET ID = ?,NAME = ?,PASSWORD = ?, GENDER = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, seller.getId());
            pstmt.setString(2, seller.getName());
            pstmt.setString(3, seller.getPassword());
            pstmt.setString(4, seller.getGender());
            int rs = pstmt.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteSeller(int id) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();

        String sql = "delete from seller where ID= ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }
}

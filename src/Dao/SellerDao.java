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
        java.sql.Connection connection = Connection.getJDBCConection();
        String sql = "select * from data where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
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
}

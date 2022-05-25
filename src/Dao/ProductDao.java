/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import dao.Connection;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Administrator
 */
public class ProductDao {
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<Product>();
        java.sql.Connection con =  Connection.getJDBCConection();
        String sql = "select * from product";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setIdPr(rs.getString("idprod"));
                product.setName(rs.getString("name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getInt("price"));
                product.setCategory(rs.getString("category"));
                products.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return products;  
    }
    public Product getProductById(String id){
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from product where idprod = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setIdPr(rs.getString("idprod"));
                product.setName(rs.getString("name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getInt("price"));
                product.setCategory(rs.getString("category"));
                return product;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void addProduct(Product product) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "INSERT INTO product (idprod, name, quantity, price, category) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, product.getIdPr());
            pstmt.setString(2, product.getName());
            pstmt.setInt(3, product.getQuantity());
            pstmt.setInt(4, product.getPrice());
            pstmt.setString(5, product.getCategory());
            
            int rs = pstmt.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   public void editProduct(Product product) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "UPDATE product SET idprod = ?,name = ?,quantity = ?, price = ?, category = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, product.getIdPr());
            pstmt.setString(2, product.getName());
            pstmt.setInt(3, product.getQuantity());
            pstmt.setInt(4, product.getPrice());
            pstmt.setString(5, product.getCategory());
            int rs = pstmt.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   public void deleteProduct(String id) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();

        String sql = "delete from product where idprod= ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }
   
   
   
}

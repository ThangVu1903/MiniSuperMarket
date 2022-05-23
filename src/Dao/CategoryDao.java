/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Category;
import dao.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import view.Categories;
/**
 *
 * @author HP
 */
public class CategoryDao {
        public List<Category> getAllCategory(){
        List<Category> CaTe_TuanAnh = new ArrayList<Category>();
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from category";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Category Category = new Category();
                Category.setIdcat(rs.getString("ID"));
                Category.setName(rs.getString("NAME"));
                Category.setDescription(rs.getString("Desc"));
                CaTe_TuanAnh.add(Category);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return CaTe_TuanAnh;  
    }
     public Category getCategoryById(String id){
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from data where id = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                Category Category = new Category();
                Category.setIdcat(rs.getString("ID"));
                Category.setName(rs.getString("NAME"));
                Category.setDescription(rs.getString("Desc"));
                return Category;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     public void addCategory(Category category) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "INSERT INTO category (IDCAT , NAME, DESCRIPTION) VALUES(?,?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, category.getIdcat());
            pstmt.setString(2, category.getName());
            pstmt.setString(3, category.getDescription());
           
            

            int rs = pstmt.executeUpdate();
            System.out.println(rs);
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      public void editcategory(Category category) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "UPDATE category SET IDCAT = ?,NAME = ?,DESCRIPTION = ?,";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, category.getIdcat());
            pstmt.setString(2, category.getName());
            pstmt.setString(3, category.getDescription());
            int rs = pstmt.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       public void deletecategory(String id) throws SQLException {
        java.sql.Connection con = Connection.getJDBCConection();

        String sql = "delete from CATEGORY where IDCAT= ?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
        }
    }
}

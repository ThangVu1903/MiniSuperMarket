/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class CategoryDao {
        public List<Category> getAllCategory(){
        List<Category> CaTe_TuanAnh = new ArrayList<Category>();
        java.sql.Connection con = Connection.getJDBCConection();
        String sql = "select * from seller";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Category Category = new Category();
                Category.setCatId(rs.getString("ID"));
                Category.setCatName(rs.getString("NAME"));
                Category.setCatDesc(rs.getString("PASSWORD"));
                CaTe_TuanAnh.add(Category);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return CaTe_TuanAnh;  
    }
}

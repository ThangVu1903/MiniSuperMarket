/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.CategoryDao;
import Model.Category;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class CatergoriService {
    private CategoryDao Ct;

    public CatergoriService() {
        Ct = new CategoryDao();
    }
    public List<Category> getAllCattegories(){
        return Ct.getAllCategory();
    }
    public Category getCategoryById(String id){
        return Ct.getCategoryById(id);
    }
    public void addCategory(Category sler) throws SQLException {
        Ct.addCategory(sler);
    }
    public void editSeller(Category sler) throws SQLException {
        Ct.editcategory(sler);
    }
    public void deleteCat(String id) throws SQLException {
        Ct.deletecategory(id);
    }
}

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
    private CategoryDao sl;

    public CatergoriService() {
        sl = new CategoryDao();
    }
    public List<Category> getAllCattegories(){
        return sl.getAllCategory();
    }
    public Category getCategoryById(String id){
        return sl.getCategoryById(id);
    }
    public void addSeller(Category sler) throws SQLException {
        sl.addSeller(sler);
    }
    public void editSeller(Category sler) throws SQLException {
        sl.editSeller(sler);
    }
    public void deleteSeller(String id) throws SQLException {
        sl.deleteSeller(id);
    }
}

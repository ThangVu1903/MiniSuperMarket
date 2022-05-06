/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.SellerDao;
import Model.Sellers;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class SellerService {
    private SellerDao sl;

    public SellerService() {
        sl = new SellerDao();
    }
    public List<Sellers> getAllSellers(){
        return sl.getAllSellers();
    }
    public Sellers getSellerById(int id){
        return sl.getSellerById(id);
    }
    public void addSeller(Sellers sler) throws SQLException {
        sl.addSeller(sler);
    }
    public void editSeller(Sellers sler) throws SQLException {
        sl.editSeller(sler);
    }
    public void deleteSeller(int id) throws SQLException {
        sl.deleteSeller(id);
    }
}

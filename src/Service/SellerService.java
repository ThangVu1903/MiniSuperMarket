/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.SellerDao;
import model.Sellers;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class SellerService {
    private SellerDao sl_117;

    public SellerService() {
        sl_117 = new SellerDao();
    }
    public List<Sellers> getAllSellers(){
        return sl_117.getAllSellers();
    }
    public Sellers getSellerById(String id){
        return sl_117.getSellerById(id);
    }
    public void addSeller(Sellers sler) throws SQLException {
        sl_117.addSeller(sler);
    }
    public void editSeller(Sellers sler) throws SQLException {
        sl_117.editSeller(sler);
    }
    public void deleteSeller(String id) throws SQLException {
        sl_117.deleteSeller(id);
    }
}

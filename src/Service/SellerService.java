/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.SellerDao;
import Model.Sellers;
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
}

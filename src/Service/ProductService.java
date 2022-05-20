/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.ProductDao;
import java.util.List;
import model.Product;

/**
 *
 * @author Administrator
 */
public class ProductService {
    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }
    
    public List<Product> getAllproducts (){
        return productDao.getAllProduct();
    }
    public Product getProductById(String id ){
        return productDao.getProductById(id);
    }
    public void addProduct(Product product){
        productDao.addProduct(product);
    }
    
    public void deleteProduct(String id){
        productDao.deleteProduct(id);
        
    }
    public void UpdateProduct(Product product){
        productDao.udate
    }
}

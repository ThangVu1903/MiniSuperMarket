/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Dao.bullingpointdao;
import Model.bullingpoints;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class bullingpointservice {
    private final bullingpointdao sl;

    public bullingpointservice() {
        sl = new bullingpointdao();
    }
    
    public List<bullingpoints> getAllbullingpoints(){
        return sl.getAllbullingpoints();
    }
    
    public List<bullingpoints> getbullingpointById(String Prodid){
        return (List<bullingpoints>) sl.getbullingpointById(Prodid);
    }

}

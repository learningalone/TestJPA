
package controllers;

import Models.Rol;
import java.util.List;
import persistence.RolJpaController;

public class RolController {
    
    RolJpaController rolJPA = new RolJpaController();
    
    public void createRol(Rol rol){
        rolJPA.create(rol);
    }
    
    public List<Rol> getRoles(){
        return rolJPA.findRolEntities();
    }
    
    public Rol getRol(Integer id){
        return rolJPA.findRol(id);
    }
    
}

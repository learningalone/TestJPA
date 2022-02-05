
package testGitHub;

import Models.Rol;
import controllers.RolController;


public class TestGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RolController rolControl = new RolController();
        
       /*Rol rol_1 = new Rol("Administrador");
        Rol rol_2 = new Rol("Gerente");
        Rol rol_3 = new Rol("Operador");
        
        rolControl.createRol(rol_1);
        rolControl.createRol(rol_2);
        rolControl.createRol(rol_3);*/
        
       for(Rol r: rolControl.getRoles()){
           System.out.println(r.getName());
       }
        
    }
    
}

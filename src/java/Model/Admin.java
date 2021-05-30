package Model;

/**
 *
 * @author Jose Manuel
 */
public class Admin {
    
     
    String pass, user, correo;
    int id;
    
    public Admin(){
        
    }

    public Admin(String pass, String user, String correo, int id) {
        this.pass = pass;
        this.user = user;
        this.correo = correo;
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    
}

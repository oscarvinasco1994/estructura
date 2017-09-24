package estructurasdedatos.cap2.listas;

/**
 *
 * @author oscar vinasco
 */
public class persona {
    
    private String nombre;
    public int cedula;
    private String direccion;
    private String telefono;
    
    
    public persona(int cedula) {
        this.cedula = cedula;      
        
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCedula() {
        return cedula;
    }


    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelofono(String telofono) {
        this.telefono = telofono;
    }

   
}


/**
 * Write a description of class Entrenador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Entrenador extends Equipo

{
    private String id_fe;
    private Entrenador(){
    super();
    }
    
    private Entrenador( String id, String nombre, String apellidos, Integer edad,String id_fe){
    
        super(id,nombre,apellidos,edad);
        this.id_fe=id_fe;
        
    
    
    }
    
    public String getId_fe(){
    return id_fe;
    
    }
    
    public void setId_fe(String id_fe){
    this.id_fe=id_fe;
    }
    
    public void imprimirDatos(){
    
    super.imprimirDatos();
    System.out.println("El nombre de su entrenador es: "+getNombre()+ "Con apellido: "+getApellidos()+ "Su edad es: "+getEdad()+ "Con identificación de la federación: "+getId_fe());
    }
   
}

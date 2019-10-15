


public class Equipo
{
    private String id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    
    public Equipo(){}
    
    public Equipo(String id, String nombre, String apellidos, Integer edad){
    
       
       this.nombre=nombre;
       
       this.edad=edad;
    }
    
    public String getId(){
    return id;
    }
    
    public void setId(String id){
    this.id=id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos(){
    return apellidos;
    }
    
    public void setApellidos(String apellidos){
    this.apellidos=apellidos;
    }
   

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    public void imprimirDatos(){
    
    System.out.println("El nombre del equipo es:  "+ getNombre()  +"   Y la edad del equipo es:  "+ getEdad());
    }
}

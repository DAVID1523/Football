
public class Masajista extends Equipo
{
    
    private String titulacion;
    private Integer xp;
    
    public Masajista(){}
    
    public Masajista(String id, String nombre, String apellidos, Integer edad,String titulacion, Integer xp){
    super(id,nombre,apellidos,edad);
    this.titulacion=titulacion;
    this.xp=xp;
   
    }
    
    
    public String getTitulacion(){
    return titulacion;
    }
    
    public void setTitulacion(String titulacion){
    this.titulacion=titulacion;
    
    }
    
    public Integer getXp(){
    return xp;
    }
    
    public void setXp(Integer xp){
    this.xp=xp;
    
    
    }
    
    public void imprimirDatos(){
    
    super.imprimirDatos();
    System.out.println("El nombre del masajista es: "+getNombre()+ "Con apellido: "+getApellidos()+ "Su edad es: "+getEdad()+ "Con titulación : " +getTitulacion()+ " Y cuenta con la cantidad de años de experiencia de: "+getXp());
    }
    
    
}



public class Jugadores extends Equipo
{
    
  
    private String dorsal;
    private String demarcacion;
    
    public Jugadores(){}
   public Jugadores(String id, String nombre, String apellidos,Integer edad, String dorsal, String demarcacion){
       super(id,nombre,apellidos,edad);
       this.dorsal=dorsal;
       this.demarcacion=demarcacion;
       
    }
   

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
   
    
    public void imprimirDatos(){
    
    super.imprimirDatos();
    System.out.println("El nombre del jugador es: " +getNombre() + "Su apellido es: "+getApellidos()+ " Su identificación es: "+getId()+ "Su edad es:  "+getEdad()+ "Su dorsal es: "+getDorsal()+ "y su demarcación es: " +getDemarcacion());
    
    }
    
    
    
}

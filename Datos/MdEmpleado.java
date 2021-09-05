
package Datos;

/**
 *
 * @author Bryan
 */
public class MdEmpleado {
    private final String Nombre;
    private final Double Enero;
    private final Double Febrero;
    private final Double Marzo;
    private final Double Total;
    private final Double Promedio;
    
    public MdEmpleado(String nombre, Double enero, Double febrero, Double marzo){
        this.Nombre = nombre;
        this.Enero = enero;
        this.Febrero = febrero;
        this.Marzo = marzo;
        this.Total = enero + febrero + marzo;
        this.Promedio = (enero + febrero + marzo)/3;
    }
    
  
    @Override
    public String toString(){
        return this.getNombre() + "," + this.getEnero() + "," 
                
            + this.getFebrero() + "," + this.getMarzo() + "," 
                
              + this.getTotal() + "," + this.getPromedio();
    }
   
    
    
    
    
    public String getNombre() {
        return Nombre;
    }
    public Double getEnero() {
        return Enero;
    }
    public Double getFebrero() {
        return Febrero;
    }
    public Double getMarzo() {
        return Marzo;
    }
    public Double getTotal() {
        return Total;
    }
    public Double getPromedio(){
        return Promedio;
    }
}

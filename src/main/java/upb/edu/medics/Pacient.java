
package upb.edu.medics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pacient {
    private LocalDateTime hora;
    private String nombre; 
    private int edad;
    private String genero;
    private int prioridad;
    private String poblacion;
    private Boolean atencion=false;
    private long documento;
    
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss");
    
    
       
    public Pacient(String nombre, int edad,  String genero, String poblacion, int prioridad,long documento){
        hora = LocalDateTime.now();
        this. genero = genero;
        this.poblacion = poblacion;
        this.nombre = nombre; 
        this.edad=edad;
        prioridad = prioridad;
        documento = documento;
        
    } 
   
    public String ShowData(){
        return    "Nombre " + nombre   + "      Edad: "+ edad + "       Genero: " + genero + 
                  "\nPoblacion: " + poblacion + "       Prioridad: " + prioridad
                + "\nHora: " + hora.format(formato)+"\n\n";
    }
     
    
    public String getDayCheckIn(){
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return hora.format(esDateFormat);
    }

    public String getNombre() {
        return nombre;
    }

     
 
    public int getTriangle() {
        return prioridad;
    }

    public void setAtencion() {
        if(atencion){
            atencion=false;
        }else{
            atencion=true;
        }
    }

    public Boolean getAtencion() {
        return atencion;
    }

    public long getIdentidad() {
        return documento;
    } 
 
    
    
    
    
    
    
}
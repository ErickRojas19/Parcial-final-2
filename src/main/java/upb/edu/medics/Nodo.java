
package upb.edu.medics;

public class Nodo {
    private Nodo next;
    private Nodo previus;
    private Pacient paciente;
     
    
    public Nodo(String nombre, int edad, String genero, String poblacion, int prioridad, long documento){
        
        Pacient P = new Pacient(nombre, edad, genero, poblacion, prioridad, documento);  
        paciente = P;
    }
    
     
    
    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevius() {
        return previus;
    }

    public void setPrevius(Nodo previus) {
        this.previus = previus;
    }

    public Pacient getPaciente() {
        return paciente;
    }
    


    
}

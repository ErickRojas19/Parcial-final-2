
 
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import upb.edu.medics.Nodo;
import upb.edu.medics.PriorityQueues;


public class prueba {
   
    PriorityQueues pila;
     
    @Before
    public void PilaDePrueba(){
        pila = new PriorityQueues();
        Nodo q = new Nodo("aa",1, "mujer", "adulto mayor" , 1, 10);
        Nodo w = new Nodo("a", 7, "mujer", "niño", 4, 4);
        pila.Agregar(q); 
        pila.Agregar(w);
        Nodo e = new Nodo("aaa", 4, "hombre", "neonato", 5, 7); 
        pila.Agregar(e);  
    } 
    @Test
    public void pruebaLongitud(){ 
        assertEquals(pila.getSize(), 3);
    } 
    @Test
    public void PacientesRevisado(){
        pila.revisarPrimerPaciente();  
        pila.salidaDePacientes(); 
        pila.verPacientesAtendidos(); 
    } 
    @Test
    public void quitarPacientes(){
        pila.revisarPrimerPaciente();  
        pila.salidaDePacientes(); 
        assertEquals(pila.getSize(), 2);
    }  
    @Test
    public void ordenamiento(){
        PriorityQueues queue = new PriorityQueues();
        Nodo q = new Nodo("junior", 11, "mujer", "neonato",   4, 9);
        queue.Agregar(q);
        Nodo w = new Nodo("dddd", 66, "mujer", "adulto mayor",   5, 22);
        queue.Agregar(w);
        
        assertTrue(queue.getFirst().getPaciente().getNombre()=="junior");
        
        Nodo e = new Nodo("peperoni", 22, "mujer", "adulto",   1, 18);
        queue.Agregar(e);
        
        assertTrue(queue.getFirst().getPaciente().getNombre()=="peperoni");
    } 
    @Test
    public void PrimeroDeRevisados(){
        pila.revisarPrimerPaciente();
        pila.revisarPrimerPaciente();
        
        pila.salidaDePacientes(); 
        String nombre = pila.getPacientesAtendidos().getPrimero().getPaciente().getNombre();
        assertTrue(nombre=="aa");
    }



            
}

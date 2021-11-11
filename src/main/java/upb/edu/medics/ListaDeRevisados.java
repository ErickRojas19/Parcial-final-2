
package upb.edu.medics;

public class ListaDeRevisados {
    
    private Nodo primero;
    private int size;
    
    
    public void ListaDeRevisados(){
        primero=null;
        size=0; 
    }
    
    public void Agregar(Nodo nuevo){
        if(size==0){
            primero=nuevo;
        }else{
            Nodo recorrido = primero;
            while(recorrido.getNext()!=null){
                recorrido = recorrido.getNext();
            }
            recorrido.setNext(nuevo);
        }
        size++;
    } 
   
    
    public String buscarPacientePorDocumento(long documento){
        if(primero==null){
            return "Lista vacia";
        }else{ 
            Nodo actual=primero;
            for(int i=0 ; i<size ; i++){
                long documentoIdentidad = actual.getPaciente().getIdentidad(); 
                if(documentoIdentidad==documento){
                   return actual.getPaciente().ShowData();  
                }
                actual=actual.getNext();
            }
        }
        return "Paciente inexistente";
    }  
    
    public String show(){ 
        String informacion = "";
        if(primero==null){
            return "Lista vacia";
        }else{ 
            Nodo actual=primero;
            for(int i=0 ; i<size ; i++){
                informacion += actual.getPaciente().ShowData();
                actual=actual.getNext();
            }
        }
        return informacion;
    }

    public int getSize() {
        return size;
    }

    public Nodo getPrimero() {
        return primero;
    }
    
}

 
package upb.edu.medics;

import javax.swing.JOptionPane;

public class PriorityQueues {
    private Nodo first;
    private int size;
    
    private ListaDeRevisados pacientesAtendidos = new ListaDeRevisados();
    
    public PriorityQueues(){
        first=null; 
    }
    
    public void Agregar(Nodo Nodo){
        if(first==null){
                first = Nodo;  
            }else{
                Nodo recorrido = first; 
                while(true){ 
                    if (Nodo.getPaciente().getTriangle()<recorrido.getPaciente().getTriangle()) {
                       if(recorrido==first){
                            first.setPrevius(Nodo);
                            Nodo.setNext(first);
                            first = Nodo;
                            break;
                        }
                        Nodo.setNext(recorrido);
                        Nodo.setPrevius(recorrido.getPrevius()); 
                        recorrido.getPrevius().setNext(Nodo);
                        recorrido.setPrevius(Nodo); 
                        break;
                    }else if(recorrido.getNext()==null){
                        recorrido.setNext(Nodo);
                        Nodo.setPrevius(recorrido); 
                        break;
                    }  
                    recorrido = recorrido.getNext();
                }  
            }
        size++;  
    }
    
    public String obtenerInformacion(){
        String a = "";
        if(size==0){
            return "Sin elementos";
        }else{
            Nodo recorrido = first; 
            for(int i=0 ; i<size ; i++){
                a += recorrido.getPaciente().ShowData();
                recorrido = recorrido.getNext();
            }
            return a;
        }
    }
    
    public void revisarPrimerPaciente(){
        if(size==0){
            System.out.println("Sin elementos");
        }else{
            Nodo recorrido = first;
            for(int i=0 ; i<size ; i++){  
                if (!recorrido.getPaciente().getAtencion()) { 
                    recorrido.getPaciente().setAtencion();
                    break;
                }
                recorrido = recorrido.getNext(); 
            }
        } 
    }
    
    
    public void salidaDePacientes(){
        if(size==0){
            System.out.println("Sin elementos");
        }else{
            Nodo recorrido = first;
            for(int i=0 ; i<size ; i++){
                if (recorrido.getPaciente().getAtencion()) { 
                    first=first.getNext();
                    pacientesAtendidos.Agregar(recorrido); 
                    size--; 
                }
                recorrido = recorrido.getNext();  
            }
        }
    }
    
   

    public void buscarPacienteRevisado(long document){
        JOptionPane.showMessageDialog(null, pacientesAtendidos.buscarPacientePorDocumento(document));
    }
    
     public void verPacientesAtendidos(){
        JOptionPane.showMessageDialog(null, pacientesAtendidos.show());
    }

    public int getSize() {
        return size;
    }

    public Nodo getFirst() {
        return first;
    }
    
    public ListaDeRevisados getPacientesAtendidos(){
        return pacientesAtendidos;
    }
    

}


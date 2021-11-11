
package upb.edu.medics;

import javax.swing.JOptionPane;

public class Medics {
 
    public static void main(String[] args) {
        PriorityQueues queue = new PriorityQueues();
        while(true){
            int orden = Integer.parseInt(JOptionPane.showInputDialog("1- revisar paciente\n2. agregar paciente\n3- ver pacientes revisados "
                    + "\n4- dar de alta a pacientes revisados \n5- ver Lista de revision  \n6-Buscarpaciente revisado por documento"));
            
            switch(orden){
                case 1: JOptionPane.showMessageDialog(null,"revisado");
                        queue.revisarPrimerPaciente();
                        break;
                        
                case 2: String name = JOptionPane.showInputDialog("Nombre");
                        int prioridad = Integer.parseInt(JOptionPane.showInputDialog("Prioridad"));
                        String poblacion = JOptionPane.showInputDialog("Poblacion");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                        String genero = JOptionPane.showInputDialog("Genero");                        
                        int documento1 = Integer.parseInt(JOptionPane.showInputDialog("documento"));
                        
                        Nodo persona = new Nodo(name, edad, genero, poblacion, prioridad, documento1);
                        queue.Agregar(persona);
                        
                        JOptionPane.showMessageDialog(null, "agregado");
                        break;
                     
                case 3: queue.verPacientesAtendidos();
                        break;
                        
                case 4: JOptionPane.showMessageDialog(null,"pacientes liberados");
                        queue.salidaDePacientes();
                        break;
                
                case 5: JOptionPane.showMessageDialog(null, queue.obtenerInformacion());
                        break;
                 
                case 6: long document = Long.parseLong(JOptionPane.showInputDialog("Documeto"));
                        queue.buscarPacienteRevisado(document);
                        break;
            }
        } 
    }
}

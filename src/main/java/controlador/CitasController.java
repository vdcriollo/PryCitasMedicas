
package controlador;

import java.util.ArrayList;
import modelo.CitaModelo;
import modelo.EspecialidadModelo;
import modelo.MedicoModelo;
import modelo.PacienteModelo;

public class CitasController {
    public ArrayList<CitaModelo> citaModelos;
    private static CitasController instancia;
    
    private CitasController(){
        citaModelos=new ArrayList<>();
    }
    
    public static CitasController getInstancia(){
        if(instancia==null){
            instancia=new CitasController();
        }
        return instancia;
    };
    
    
    public CitaModelo guardar(
            PacienteModelo pm,
            MedicoModelo mm, 
            EspecialidadModelo em, 
            String descripcion,
            String fecha,
            String hora
    ){
        CitaModelo cm=new CitaModelo(pm, mm, em, descripcion, fecha, hora);
        
        citaModelos.add(cm);
        return cm;
    }
}

package com.mycompany.prycitasmedicas;

import controlador.EspecialidadControlador;
import controlador.MedicoControlador;
import controlador.PacienteCoontrolador;
import modelo.EspecialidadModelo;
import vista.PantallaPrincipal;

public class PryCitasMedicas {

    public static void main(String[] args) {
        
        PacienteCoontrolador pc=PacienteCoontrolador.getInstacia();
        pc.guardarDatos("050212515", "LUIS ARIAS", 20, true);
        pc.guardarDatos("215151", "FELIPE", 20, true);
        pc.guardarDatos("2125121","ANA", 20, false);
        
        EspecialidadControlador ec=EspecialidadControlador.getInstancia();
        EspecialidadModelo em1= ec.guardar("MEDICINA GENERAL");
        EspecialidadModelo em2= ec.guardar("PEDIATRIA");
        EspecialidadModelo em3 = ec.guardar("ODONTOLOGIA");
        
        MedicoControlador mc=MedicoControlador.getInstacia();
        mc.guardar(em1, "21250215", "JORGE", 30, true);
        mc.guardar(em2, "25451215145", "GEORGINA", 30, false);
        mc.guardar(em3, "11512", "PEDRO", 30, true);
        
        
        
        PantallaPrincipal pp= new PantallaPrincipal();
        pp.setVisible(true);
        pp.setLocationRelativeTo(null);
    }
}

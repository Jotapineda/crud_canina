
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    //aqui instanciamos por medio de este objeto a la controladora
    // de la persistencia con la controladora de la lógica
    
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza,
            String color, String observaciones, String alergico,
            String atemEsp, String nombreDuenio, String celDuenio) {
       
        //creamos el dueño y asignamos sus valores
        Duenio duenio= new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);    
        
        
        //creamos la mascota y asignamos sus valores
        Mascota masco= new Mascota();
        masco.setNombreMascota(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atemEsp);
        masco.setAlergico(alergico);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);              
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
       
        controlPersis.borrarMascota(num_cliente);
    }


    public Mascota traerMascota(int num_cliente) {
       return controlPersis.traerMascota(num_cliente);
        
    }


    public void modificarMascota(Mascota masco, String nombreMasco, String raza, 
            String color, String observaciones, String alergico, String atemEsp,
            String nombreDuenio, String celDuenio) {
        
        masco.setNombreMascota(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atemEsp);
        
       //modifico la mascota
       controlPersis.modificarMascota(masco);
       
       //seteo los valores del dueño
       Duenio dueno= this.buscarDuenio(masco.getUnDuenio().getId_duenio());
       dueno.setCelDuenio(celDuenio);
       dueno.setNombre(nombreDuenio);
       
       //llamnar al modificar dueño
       
       this.modificarDuenio(dueno);
    } 

    private Duenio buscarDuenio(int id_duenio) {
        
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        
        controlPersis.modificarDuenio(dueno);
    }
}

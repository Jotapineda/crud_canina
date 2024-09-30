
package com.mycompany.peluqueriacanina.Persistencia;

import com.mycompany.peluqueriacanina.Logica.Duenio;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import com.mycompany.peluqueriacanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //con estos dos objetos instanciamos tanto el jpa controller
    //de Duenio t de Mascota con la controladora de la persisitencia
    DuenioJpaController duenioJpa= new DuenioJpaController();
    MascotaJpaController mascoJpa= new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //crear en la base de datos el dueño
        duenioJpa.create(duenio);
        
        //crear en la base de datos la mascota
        mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        
        //java no sabe si el id que se va a borrar exixte, por eso lo manejamos
        //desde un try catch
        
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
       
       return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        
       return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
       
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

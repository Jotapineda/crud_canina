
package com.mycompany.peluqueriacanina.Logica;

//esta es clasew de la mascota
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//de esta manera vuelvo a esta clase una tabla en la basew de datos
@Entity

public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    
    private String nombreMascota;
    private String raza;
    private String color;
    private String atencion_especial;
    private String observaciones;
    private String Alergico;
    
    //de esta manera estamos realizando el 1 a 1 entre la clase
    //mascota y la clase duenio...
    //la estamos realizando desde la clase mascota hacia 
    //la clase duenio
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombreMascota, String raza, String color, String atencion_especial, String observaciones, String Alergico, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.Alergico = Alergico;
        this.unDuenio = unDuenio;
    }

    public String getAlergico() {
        return Alergico;
    }

    public void setAlergico(String Alergico) {
        this.Alergico = Alergico;
    }

   
    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
    
    
}

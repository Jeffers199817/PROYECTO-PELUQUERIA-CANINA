/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class Controladora {

  ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String ateEsp) {
      
        Duenio duenio = new Duenio();
        
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaicones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        masco.setUnDuenio(duenio);
        
        controladoraPersis.guardar(duenio,masco);
        
    }

    public List<Mascota> traerMascotas() {
        System.out.println(controladoraPersis.traerMascotas());
        System.out.println("Hola");
        
      return  controladoraPersis.traerMascotas();
        
        
    }

    public void eliminarMascota(int num_cliente) {
        
        controladoraPersis.eliminarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
      
      
      return controladoraPersis.traerMascota(num_cliente);
       
        
    }

    public void modificarMascota(Mascota masco, String nombreMascota, String raza, String color,
            String observaciones, String nombreDuenio, String celDuenio, String alergico, String ateEsp) {
        
        masco.setNombre(nombreMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaicones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        
        controladoraPersis.modificarMascota(masco);
        
        //steo nuevos valores de duenio
        
        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getIdDuenio());
   
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //llamar al modificar Dueno
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int idDuenio) {
        
        return controladoraPersis.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio duenio) {
    controladoraPersis.modificarDuenio(duenio) ;
    }

   
  
 
  
    
    
}

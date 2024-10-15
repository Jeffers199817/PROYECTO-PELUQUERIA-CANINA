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
  
 
  
    
    
}

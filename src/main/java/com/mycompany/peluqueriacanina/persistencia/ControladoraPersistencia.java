/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class ControladoraPersistencia {
    
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        //Crear en la BD el Dueño 
        duenioJpa.create(duenio);
        //Crear en la BD la mascota
        mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        
        List<Mascota> listaMascota = mascoJpa.findMascotaEntities();
        
        return listaMascota;
       
    }

    public void eliminarMascota(int num_cliente) {
       
        mascoJpa.destroy(num_cliente);
        duenioJpa.destroy(num_cliente);
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paradigmas.unidad2.tp2.main;

import objects.Cliente;

/**
 *
 * @author MAXI
 */
public class Main {
   
    public static void main (String[]args){
    
        Cliente cliente;
        cliente = new Cliente();
        
        cliente.setDireccion("Av. Rio Talampaya");
        cliente.setDni(37492452);
        cliente.setNombre("Carlos Perez");
        
        System.out.println(cliente);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

import com.mycompany.interfaz.IFuego;

/**
 *
 * @author DREP
 */
public class Charmander extends Pokemoon implements IFuego {

    public Charmander() {
    } 

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y Ataco Con Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Charmander y Ataco Con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y Ataco Con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Super ataque De Puno De Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Super ataque De Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Super Lanza Llamas");
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

/**
 *
 * @author DREP
 */
public abstract class Pokemoon {

    protected byte num_pokedex;
    protected String nombrePokemon;
    protected byte pesoPokemon;
    protected char sexo;
    protected String temporadaQueAparece;
    protected String tipo;

    protected abstract void atacarPlacaje();

    protected abstract void atacarArañazo();

    protected abstract void atacarMordisco();

}

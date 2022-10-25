/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

/**
 *
 * @author Araceli
 */
public abstract class Ave {
TipoSonido tipoSonido;
TipoVuelo tipoVuelo;
public void setTipoVuelo(TipoVuelo tipoVuelo){
    this.tipoVuelo=tipoVuelo;
}
public void setTipoSonido(TipoSonido tipoSonido){
    this.tipoSonido=tipoSonido;
}
public void realizarVuelo(){
    tipoVuelo.vuelo();
}
public void relizarSonido(){
    tipoSonido.makeSound();
}
}

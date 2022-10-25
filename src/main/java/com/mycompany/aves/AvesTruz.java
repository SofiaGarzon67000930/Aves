/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

/**
 *
 * @author Araceli
 */
public class AvesTruz extends Ave{
    public AvesTruz(){
        this.setTipoSonido(new SinCanto());
        this.setTipoVuelo(new SinVuelo());
    }
}

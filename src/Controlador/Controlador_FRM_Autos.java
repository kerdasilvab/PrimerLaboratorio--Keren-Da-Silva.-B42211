/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosAutos;
import Vista.FRM_Autos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Keren
 */
public class Controlador_FRM_Autos implements ActionListener{
    FRM_Autos Autos;
    MetodosAutos metodos;

public Controlador_FRM_Autos(FRM_Autos Autos)
{
    this.Autos=Autos;
    metodos=new MetodosAutos();
}

public void actionPerformed(ActionEvent e)
{
    if(e.getActionCommand().equals("Consultar"))
    {
        buscar();
    }
    if(e.getActionCommand().equals("Agregar"))
    {
        this.metodos.agregarAuto(this.Autos.devolverInformacion());
        metodos.mostrarInformacionAutos();
        Autos.limpiar();
        Autos.estadoInicial();
    }
    if(e.getActionCommand().equals("Modificar"))
    {
       this.metodos.modificarAuto(this.Autos.devolverRegistro(), this.Autos.devolverNombre(),this.Autos.devolverCedula(),this.Autos.devolverPlaca());
       this.Autos.limpiar();
       this.Autos.estadoInicial();
    }
    if(e.getActionCommand().equals("Eliminar"))
    {
        this.metodos.eliminarAuto(this.Autos.devolverPlaca());
        this.Autos.limpiar();
        this.Autos.estadoInicial();
    }
  }
    public void buscar()
    {
      if(metodos.consultarAuto(this.Autos.devolverRegistro()))
      {
          System.out.println("Entró");
          this.Autos.mostrarInformacion(metodos.getArregloInformacion());
          this.Autos.habilitarOpciones();
          this.Autos.deshabilitarRegistro();
          this.Autos.mostrarMensaje("El vehiculo con el número de registro: "+this.Autos.devolverRegistro()+" se encuentra en la base de datos");
      }
      else
      {
          System.out.println("Entró");
          this.Autos.mostrarMensaje("El vehiculo aún no ha sido registrado.");
          this.Autos.habilitarAgregar();
      }  
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Keren
 */
public class MetodosAutos {
    
    ArrayList <Autos> arrayAutos;
    String arregloInformacion[];
    
    public MetodosAutos()
    {
        arrayAutos=new ArrayList<Autos>();
        arregloInformacion=new String[4];
    }
    public void agregarAuto(String informacion[])
    {
        Autos temporal=new Autos(informacion[0], informacion[1],informacion[2], informacion[3]);
        this.arrayAutos.add(temporal);
    }
    
    public void mostrarInformacionAutos()
    {
        Autos temporal;
        temporal=this.arrayAutos.get(0);
        System.out.println(temporal.getInformacion());
    }
    
    public boolean consultarAuto(String numeroRegistro)
    {
        boolean encontrado=false;
        for(int i=0;i<arrayAutos.size();i++)
        {
           if(arrayAutos.get(i).getPlaca().equals(numeroRegistro))
                {
                    arregloInformacion[0]=arrayAutos.get(i).getNombre();
                    arregloInformacion[1]=arrayAutos.get(i).getCedula();
                    this.arregloInformacion[2]=arrayAutos.get(i).getPlaca();
                    encontrado=true;
                }
        }
        return encontrado;
    }
    
    public void modificarAuto(String numeroRegistro, String nombre, String cedula, String placa)
    {
    for(int i=0;i<arrayAutos.size();i++)
        {
           if(arrayAutos.get(i).getPlaca().equals(placa))
            {
                this.arrayAutos.get(i).setNumeroRegistro(numeroRegistro);
                this.arrayAutos.get(i).setNombre(nombre);
                this.arrayAutos.get(i).setCedula(cedula);
            }
        }
    }
    
    public void eliminarAuto(String placa)
    {
        for(int i=0;i<arrayAutos.size();i++)
        {
           if(arrayAutos.get(i).getPlaca().equals(placa))
            {
               this.arrayAutos.remove(i);
            }
        }
    }
    
    public String[] getArregloInformacion(){
        return arregloInformacion;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_permisos;

import javax.swing.JOptionPane;
import modelo.crudPermisos;
import modelo.permisoSG;


public class selelct_tipoper {
    public int consulta_select (String fecha_creacion, int documento, String tipo, String fecha_salida, String fecha_ingreso, String hora_Salida,  String hora_ingreso, String fecha_ingresoReal, String hora_ingresoReal, String fecha_salidaReal, String hora_salidaReal , String observacion_permiso_llegada, String motivo, String estado,  String autoriza, String evidenciaAdjunta){
        
        //aqui se pasan en variables el campo seleccionado y se comparan
        String tipo1= "semana morning";
        String tipo2= "semana tarde";
        String tipo3= "Extra";
        
        
        //comparando el tipo de permiso
        if(tipo.equals(tipo1) || tipo.equals(tipo2) || tipo.equals(tipo3) ){
            
            //JOptionPane.showMessageDialog(null, "permiso semana");
            
            //se captura la fecha de salida y se pasa a la de ingreso
            String fi = fecha_salida;
            String f_ingreso = fi;
            permisoSG setget = new permisoSG(documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal, hora_ingresoReal, fecha_salidaReal, hora_salidaReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta, fecha_ingreso, fecha_creacion, estado);

            crudPermisos crud = new crudPermisos();
            crud.guardar_permiso(setget, f_ingreso);
             
        }else{
            //JOptionPane.showMessageDialog(null, "otro tipo e permiso");
            
            permisoSG setget = new permisoSG(documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal, hora_ingresoReal, fecha_salidaReal, hora_salidaReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta, fecha_ingreso, fecha_creacion, estado);
          
            crudPermisos crud = new crudPermisos();            
            crud.guardar_permiso(setget, fecha_ingreso);
            
        }
        
        int x=0;
        return x;
    }
}

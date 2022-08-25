package co.edu.cue.Controllers;

import co.edu.cue.Services.ServicesImpl.JugueteriaService;

import javax.swing.*;

public class VentaControlador {

    public void crearVenta(JugueteriaService jugueteriaService){
        String fechaDeVenta = JOptionPane.showInputDialog("Ingrese la fecha de la venta");
        jugueteriaService.crearVenta(fechaDeVenta);
    }

}

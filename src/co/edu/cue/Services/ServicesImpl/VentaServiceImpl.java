package co.edu.cue.Services.ServicesImpl;

import co.edu.cue.Model.*;
import co.edu.cue.Services.VentaService;

import javax.swing.*;

public class VentaServiceImpl implements VentaService {

    private JugueteServiceImpl jugueteService = new JugueteServiceImpl();
    private Venta ventas[] = new Venta[100];


    @Override
    public void crearVenta(String fechaDeVenta, DetalleVenta[] detalleVenta, Cliente cliente, Empleado empleado) {
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] == null){
                ventas[i] = new Venta(fechaDeVenta, detalleVenta, cliente, empleado);
                JOptionPane.showMessageDialog(null, "La venta ha sido creada");
                System.out.println(ventas[i].getDetalles());
                System.out.println(ventas[i]);
                break;
            }else if(i == ventas.length-1){
                JOptionPane.showMessageDialog(null, "No se pueden hacer mas ventas ");
            }
        }
    }

    @Override
    public DetalleVenta[] crearDetalleVenta(Juguete juguetes[]) {
        boolean parar = true;
        int contador = 0;
        DetalleVenta detalleVenta[] = new DetalleVenta[5];
        do{
            if(parar != false){
                String nombreJuguete = JOptionPane.showInputDialog("Ingrese el nombre del juguete que desea comprar");
                for (int i = 0; i < juguetes.length; i++) {
                    if(juguetes[i] != null){
                        if(juguetes[i].getNombre().equalsIgnoreCase(nombreJuguete)){
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades quiere comprar"));
                            if(juguetes[i].getStock() >= cantidad){
                                detalleVenta[contador] = new DetalleVenta(juguetes[i],cantidad);
                                contador++;
                                String agregarJuguete = JOptionPane.showInputDialog("Ingrese 1 si desea agregar otro juguete y 2 si desea continuar con la  venta");
                                if(agregarJuguete.equalsIgnoreCase("2")){
                                    parar = false;
                                }else{
                                    parar = true;
                                }
                            }
                        }
                    }

                }
            }
        }while (parar);
        return detalleVenta;
    }
}

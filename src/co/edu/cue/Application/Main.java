package co.edu.cue.Application;

import co.edu.cue.Controllers.JugueteControlador;
import co.edu.cue.Controllers.UsuarioControlador;
import co.edu.cue.Controllers.VentaControlador;
import co.edu.cue.Services.ServicesImpl.JugueteriaService;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        final JugueteriaService jugueteriaService = new JugueteriaService();
        final JugueteControlador jugueteControlador = new JugueteControlador();
        final UsuarioControlador usuarioControlador = new UsuarioControlador();
        final VentaControlador ventaControlador = new VentaControlador();

        while(true){
            String opcion = JOptionPane.showInputDialog("Ingrese la opcion que desea: \n 1.Juguetes \n 2.Agregar Cliente\n 3.Agregar empleado\n 4.Vender Juguetes");
            switch (opcion){
                case "1":
                    String opcion2 = JOptionPane.showInputDialog("Ingrese la opcion que desea \n1.Agregar Juguete \n2.Disminuir existencias \n3.Aumentar existencias\n4.Informar juguete por tipo\n5.Informar cantidad total de juguetes\n6.Informar valor total de todos los juguetes\n7.Informar tipo con mas juguetes\n8.Informar tipo con menos juguetes\n9.Juguetes con valor mayor al indicado");
                    switch (opcion2){
                        case "1":
                            jugueteControlador.agregarJuguete(jugueteriaService);
                            break;
                        case "2":
                            jugueteControlador.disminuirExistencias(jugueteriaService);
                            break;
                        case "3":
                            jugueteControlador.aumentarExistencias(jugueteriaService);
                            break;
                        case "4":
                            jugueteControlador.informarJuguetePorTipo(jugueteriaService);
                            break;
                        case "5":
                            jugueteControlador.informarCantidadTotal(jugueteriaService);
                            break;
                        case "6":
                            jugueteControlador.informarValorTotal(jugueteriaService);
                            break;
                        case "7":
                            jugueteControlador.informarTipoConMasJuguetes(jugueteriaService);
                            break;
                        case "8":
                            jugueteControlador.informarTipoConMenosJuguetes(jugueteriaService);
                            break;
                        case "9":
                            jugueteControlador.informarJuguetesConValorMayorAlIndicado(jugueteriaService);
                            break;

                    }
                    break;
                case "2":
                    usuarioControlador.agregarCliente(jugueteriaService);
                    break;
                case "3":
                    usuarioControlador.agregarEmpleado(jugueteriaService);
                    break;
                case "4":
                    ventaControlador.crearVenta(jugueteriaService);
                    break;


            }
        }

    }


}

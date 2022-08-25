package co.edu.cue.Controllers;
import co.edu.cue.Services.ServicesImpl.JugueteriaService;
import javax.swing.*;

public class JugueteControlador {

    public void agregarJuguete(JugueteriaService jugueteriaService){
        String nombre = JOptionPane.showInputDialog("Escriba el nombre");
        String material = JOptionPane.showInputDialog("Escriba el nombre del material: Plastico, Tela , Electronico");
        Double precio = Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio"));
        int stock = Integer.parseInt(JOptionPane.showInputDialog("Escriba cuantos juguetes hay disponibles"));
        jugueteriaService.agregarJuguete(nombre, material, precio, stock);
    }

    public void disminuirExistencias(JugueteriaService jugueteriaService) {
        jugueteriaService.disminuirExistenciasJuguete();
    }

    public void aumentarExistencias(JugueteriaService jugueteriaService) {
        jugueteriaService.aumentarExistenciasJuguete();
    }

    public void informarJuguetePorTipo(JugueteriaService jugueteriaService) {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de juguete que desea consultar su cantidad (Plastico, Electronico, Tela): ");
        jugueteriaService.informarJuguetePorTipo(tipo);
    }


    public void informarCantidadTotal(JugueteriaService jugueteriaService) {
        jugueteriaService.informarCantidadTotalJuguetes();
    }

    public void informarValorTotal(JugueteriaService jugueteriaService) {
        jugueteriaService.informarValorTotalJuguetes(jugueteriaService);
    }

    public void informarTipoConMasJuguetes(JugueteriaService jugueteriaService) {
        jugueteriaService.informarTipoConMasJuguetes();
    }

    public void informarTipoConMenosJuguetes(JugueteriaService jugueteriaService) {
        jugueteriaService.informarTipoConMenosJuguetes();
    }

    public void informarJuguetesConValorMayorAlIndicado(JugueteriaService jugueteriaService) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que desea"));
        jugueteriaService.informarJuguetesConValorMayorAlIndicado(valor);
    }
}

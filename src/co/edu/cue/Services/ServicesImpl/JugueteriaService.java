package co.edu.cue.Services.ServicesImpl;

import co.edu.cue.Model.Cliente;
import co.edu.cue.Model.DetalleVenta;
import co.edu.cue.Model.Empleado;
import co.edu.cue.Model.Juguete;

import javax.swing.*;

public class JugueteriaService {

    private JugueteServiceImpl jugueteService = new JugueteServiceImpl();
    private UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();
    private VentaServiceImpl ventaService = new VentaServiceImpl();

    public void agregarJuguete(String nombre, String material, double precio, int stock) {
        jugueteService.agregarJuguete(nombre, material, precio, stock);
    }


    public void disminuirExistenciasJuguete() {
        Juguete juguete = jugueteService.buscarJuguete();
        jugueteService.disminuirCantidadDeJuguetes(juguete);

    }

    public void aumentarExistenciasJuguete() {
        Juguete juguete = jugueteService.buscarJuguete();
        jugueteService.aumentarCantidadDeJuguetes(juguete);
    }

    public void agregarCliente(String nombre, String documento, String telefono, String direccion, String fechaNacimiento, String correo) {
        usuarioService.agregarCliente(nombre, documento, telefono, direccion, fechaNacimiento, correo);
    }

    public void agregarEmpleado(String nombre, String documento, String telefono, String direccion, Double salario, String fechaDeIngreso) {
        usuarioService.agregarEmpleado(nombre, documento, telefono, direccion, salario, fechaDeIngreso);
    }

    public void crearVenta(String fechaDeVenta){
        Empleado empleado = usuarioService.buscarEmpleado();
        Cliente cliente = usuarioService.buscarCliente();
        DetalleVenta detalleVenta[] = ventaService.crearDetalleVenta(jugueteService.getJuguetes());
        ventaService.crearVenta(fechaDeVenta, detalleVenta, cliente, empleado);
    }


    public void informarJuguetePorTipo(String tipo) {
        jugueteService.informarJuguetesPorTipo(tipo);
    }


    public void informarCantidadTotalJuguetes() {
        jugueteService.informarCantidadTotalJuguetes();
    }

    public void informarValorTotalJuguetes(JugueteriaService jugueteriaService) {
        jugueteService.informarValorTotalJuguetes();
    }

    public void informarTipoConMasJuguetes() {
        jugueteService.informarTipoConMasJuguetes();
    }

    public void informarTipoConMenosJuguetes() {
        jugueteService.informarTipoConMenosJuguetes();
    }

    public void informarJuguetesConValorMayorAlIndicado(double valor) {
        jugueteService.juguetesMasCaroQueValorIndicado(valor);
    }
}

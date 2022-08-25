package co.edu.cue.Services;

import co.edu.cue.Model.Cliente;
import co.edu.cue.Model.DetalleVenta;
import co.edu.cue.Model.Empleado;
import co.edu.cue.Model.Juguete;

public interface VentaService {

    void crearVenta(String fechaDeVenta, DetalleVenta[] detalleVenta, Cliente cliente, Empleado empleado);

    DetalleVenta[] crearDetalleVenta(Juguete juguetes[]);

}

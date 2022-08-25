package co.edu.cue.Services;
import co.edu.cue.Model.Juguete;

public interface JugueteService {

    void agregarJuguete(String nombre, String material, double precio, int stock);

    void aumentarCantidadDeJuguetes(Juguete juguete);

    void disminuirCantidadDeJuguetes(Juguete juguete);

    Juguete buscarJuguete();

    void informarJuguetesPorTipo(String tipo);

    void informarCantidadTotalJuguetes();

    void informarValorTotalJuguetes();

    void informarTipoConMasJuguetes();

    void informarTipoConMenosJuguetes();

    void juguetesMasCaroQueValorIndicado(double valor);
}

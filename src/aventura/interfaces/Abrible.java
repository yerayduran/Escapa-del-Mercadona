package aventura.interfaces;

import aventura.domain.Llave;
import aventura.domain.RespuestaAccion;

/**
 * Representa un objeto del juego que puede abrirse mediante una llave.
 * <p>
 * Los objetos que implementan esta interfaz deben definir:
 * <ul>
 *   <li>La lógica necesaria para intentar abrirse con una llave.</li>
 *   <li>Su estado actual (abierto o cerrado).</li>
 * </ul>
 * </p>
 *
 * @author Yeray Durán
 * @version 1.0
 */
public interface Abrible {

    /**
     * Intenta abrir el objeto usando la llave proporcionada.
     *
     * @param llave Llave utilizada para intentar abrir el objeto.
     * @return Una {@link RespuestaAccion} indicando si la apertura fue exitosa
     *         y un mensaje descriptivo para el jugador.
     */
    RespuestaAccion abrir(Llave llave);

    /**
     * Indica si el objeto ya está abierto.
     *
     * @return true si el objeto está abierto; false en caso contrario.
     */
    boolean estaAbierto();
}
package aventura.domain;

import aventura.interfaces.Leible;

/**
 * Representa una nota dentro del mundo de la aventura.
 * Una nota es un {@link Item} que contiene un texto legible
 * por el jugador. Su función principal es proporcionar
 * información, pistas o narrativa adicional.
 *
 * Implementa la interfaz {@link Leible}, lo que garantiza
 * que cualquier nota pueda ser leída mediante el método {@code leer()}.
 *
 * @author Manuel Pérez
 * @version 1.0
 */
public class Nota extends Item implements Leible {

    /**
     * Texto completo que contiene la nota.
     * Es inmutable una vez creada.
     */
    private final String texto;

    /**
     * Crea una nueva nota con los atributos básicos heredados de {@link Item}
     * y un texto asociado que podrá ser leído por el jugador.
     *
     * @param nombre      Nombre identificativo de la nota.
     * @param descripcion Descripción breve del objeto nota.
     * @param visible     Indica si la nota es visible en la escena.
     * @param texto       Contenido textual que se mostrará al leer la nota.
     */
    public Nota(String nombre, String descripcion, boolean visible, String texto) {
        super(nombre, descripcion, visible);
        this.texto = texto;
    }

    /**
     * Devuelve el contenido textual de la nota.
     *
     * @return El texto completo almacenado en la nota.
     */
    @Override
    public String leer() {
        return texto;
    }
}
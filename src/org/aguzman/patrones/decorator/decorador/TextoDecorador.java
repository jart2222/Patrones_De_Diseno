package org.aguzman.patrones.decorator.decorador;

import org.aguzman.patrones.decorator.Formateable;

abstract class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}

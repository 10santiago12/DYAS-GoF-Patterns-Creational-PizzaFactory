package edu.unisabana.pizzafactory.model.PizzaDelgada;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public class AmasadorPizzaDelgada implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}

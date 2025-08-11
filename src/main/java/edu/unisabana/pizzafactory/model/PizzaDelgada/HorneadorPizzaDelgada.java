package edu.unisabana.pizzafactory.model.PizzaDelgada;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;

public class HorneadorPizzaDelgada implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
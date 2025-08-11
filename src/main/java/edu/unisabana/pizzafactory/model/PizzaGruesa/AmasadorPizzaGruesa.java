package edu.unisabana.pizzafactory.model.PizzaGruesa;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public class AmasadorPizzaGruesa implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[@@] Amasando la pizza gruesa tipo pan.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
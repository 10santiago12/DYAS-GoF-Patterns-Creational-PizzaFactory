package edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public class AmasadorPizzaIntegral implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[@@] Amasando la pizza integral con harina integral.");
    }
}

package edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.*;

public class HorneadorPizzaIntegral implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza integral con temperatura especial.");
    }
}

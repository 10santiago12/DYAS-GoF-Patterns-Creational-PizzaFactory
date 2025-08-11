package edu.unisabana.pizzafactory.model.PizzaGruesa;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;

public class HorneadorPizzaGruesa implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza gruesa tipo pan.");
    }
}
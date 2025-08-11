package edu.unisabana.pizzafactory.model.PizzaDelgada;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class MoldeadorPizzaDelgada implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza pequeña de masa convencional.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaGrande() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza grande de masa convencional.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}

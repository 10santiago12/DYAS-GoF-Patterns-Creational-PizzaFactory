package edu.unisabana.pizzafactory.model.PizzaGruesa;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class MoldeadorPizzaGruesa implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza pequeña de masa gruesa.");
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");
    }

    @Override
    public void moldearPizzaGrande() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza grande de masa gruesa.");
    }
}
package edu.unisabana.pizzafactory.model.PizzaIntegral;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.PizzaGruesa.MoldeadorPizzaGruesa;

public class MoldeadorPizzaIntegral implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza pequeña de masa integral.");
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");
    }

    @Override
    public void moldearPizzaGrande() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza grande de masa integral.");
    }
}

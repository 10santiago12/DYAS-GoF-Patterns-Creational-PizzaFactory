package edu.unisabana.pizzafactory.model.PizzaIntegral;

import edu.unisabana.pizzafactory.model.Interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class PizzaIntegralFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
}
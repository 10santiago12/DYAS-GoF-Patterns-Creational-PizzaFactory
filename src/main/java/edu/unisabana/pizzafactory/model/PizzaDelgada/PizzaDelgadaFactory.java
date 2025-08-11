package edu.unisabana.pizzafactory.model.PizzaDelgada;

import edu.unisabana.pizzafactory.model.Interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class PizzaDelgadaFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}

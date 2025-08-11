package edu.unisabana.pizzafactory.model.PizzaGruesa;

import edu.unisabana.pizzafactory.model.Interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

public class PizzaGruesaFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}

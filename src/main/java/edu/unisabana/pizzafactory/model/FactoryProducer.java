package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.model.Interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.PizzaDelgada.PizzaDelgadaFactory;
import edu.unisabana.pizzafactory.model.PizzaGruesa.PizzaGruesaFactory;
import edu.unisabana.pizzafactory.model.PizzaIntegral.PizzaIntegralFactory;

public class FactoryProducer {
    public static PizzaFactory getFactory(PizzaTipo tipo) {
        switch (tipo) {
            case DELGADA: return new PizzaDelgadaFactory();
            case GRUESA: return new PizzaGruesaFactory();
            case INTEGRAL: return new PizzaIntegralFactory();
            default: throw new IllegalArgumentException("Tipo de pizza no soportado: " + tipo);
        }
    }
}
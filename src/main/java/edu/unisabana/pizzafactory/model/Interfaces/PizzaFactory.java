package edu.unisabana.pizzafactory.model.Interfaces;

public interface PizzaFactory {
    Amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();
}

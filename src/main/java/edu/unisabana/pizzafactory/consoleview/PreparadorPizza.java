package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.FactoryProducer;
import edu.unisabana.pizzafactory.model.PizzaTipo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {

    private PizzaFactory factory;

    public PreparadorPizza(PizzaFactory factory) {
        this.factory = factory;
    }

    public static void main(String args[]) {
    try {
        Ingrediente[] ingredientes = new Ingrediente[]{
            new Ingrediente("queso", 1),
            new Ingrediente("jamon", 2)
        };

        // --- Pizza DELGADA ---
        System.out.println("\n=== Preparando Pizza DELGADA ===");
        PizzaFactory factoryDelgada = FactoryProducer.getFactory(PizzaTipo.DELGADA);
        PreparadorPizza ppDelgada = new PreparadorPizza(factoryDelgada);
        ppDelgada.prepararPizza(ingredientes, Tamano.MEDIANO);

        // --- Pizza INTEGRAL ---
        System.out.println("\n=== Preparando Pizza INTEGRAL ===");
        PizzaFactory factoryIntegral = FactoryProducer.getFactory(PizzaTipo.INTEGRAL);
        PreparadorPizza ppIntegral = new PreparadorPizza(factoryIntegral);
        ppIntegral.prepararPizza(ingredientes, Tamano.MEDIANO);

    } catch (ExcepcionParametrosInvalidos ex) {
        Logger.getLogger(PreparadorPizza.class.getName())
            .log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
    }
}

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador am = factory.crearAmasador();
        Moldeador mp = factory.crearMoldeador();
        Horneador hpd = factory.crearHorneador();

        am.amasar();

        switch (tam) {
            case PEQUENO:
                mp.moldearPizzaPequena();
                break;
            case MEDIANO:
                mp.moldearPizzaMediana();
                break;
            case GRANDE:
                mp.moldearPizzaGrande();
                break;
            default:
                throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!: {0}", Arrays.toString(ingredientes));
        // CÓDIGO DE LLAMADO AL MICROCONTROLADOR
    }
}

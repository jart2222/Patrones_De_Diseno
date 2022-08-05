package org.aguzman.patrones.factory;

import org.aguzman.patrones.factory.producto.PizzaNewYorkItaliana;
import org.aguzman.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.aguzman.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "Italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
        return producto;
    }
}

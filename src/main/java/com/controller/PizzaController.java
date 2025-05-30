package com.controller;

import com.builder.PizzaBuilder;
import com.model.Pizza;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    public PizzaController() {
        super();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(listPizza(), HttpStatus.OK);
    }

    @GetMapping(path = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPizza(@PathVariable("name") String name) {
        var pizza = listPizza().stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElse(null);
        if (Objects.nonNull(pizza)) {
            return new ResponseEntity<>(pizza, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    private Set<Pizza> listPizza() {
        var pizzas = new TreeSet<Pizza>();

        var pizzaBuilder = new PizzaBuilder(10)
                .setName("Pizza 1")
                .withBacon(true)
                .withCheese(true)
                .withTomato(true);

        pizzas.add(pizzaBuilder.build());

        pizzaBuilder.setName("Pizza 4");
        pizzas.add(pizzaBuilder.build());

        pizzaBuilder.setName("Pizza 2");
        pizzas.add(pizzaBuilder.build());

        pizzaBuilder.setName("Pizza 5");
        pizzas.add(pizzaBuilder.build());

        return pizzas;
    }

}

package com.gsy.so78152140;

import javafx.scene.control.Button;

import java.util.Set;
import java.util.UUID;

public class Randomize extends Button {

    private final Set<UpdateState> states;

    public Randomize(Set<UpdateState> states) {
        super("RANDOM");
        this.states = states;
        setOnAction(action -> randomize());
    }

    private void randomize() {
        states.forEach(d -> d.stateProperty().setValue(UUID.randomUUID().toString()));
    }

}

package com.gsy.so78152140;

import javafx.beans.property.StringProperty;

public record UpdateState(StringProperty state, StringProperty name) {

    StringProperty stateProperty() {
        return state;
    }

    StringProperty nameProperty() {
        return name;
    }
}

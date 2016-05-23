package com.antoine.colorgame;

/**
 * Created by raphaellefebure on 23/05/2016.
 */
public enum Colors {
    red("r", "R"),
    orange("o", "O"),
    yellow("j", "J"),
    green("v", "V"),
    blue("b", "B"),
    violet("i", "I");

    private String uncontrolled;
    private String controlled;

    Colors(String uncontrolled, String controlled) {
        this.uncontrolled = uncontrolled;
        this.controlled = controlled;
    }

    public String getUncontrolled() {
        return uncontrolled;
    }

    public void setUncontrolled(String uncontrolled) {
        this.uncontrolled = uncontrolled;
    }

    public String getControlled() {
        return controlled;
    }

    public void setControlled(String controlled) {
        this.controlled = controlled;
    }

    public Colors findByUnControlled(String uncontrolled) {
        for (Colors colors : Colors.values()) {
            if (colors.uncontrolled.equals(uncontrolled)) {
                return colors;
            }
        }
        return null;
    }

    public String listOptions() {
        Colors[] values = Colors.values();
        String options = "";
        for (int i = 0; i < values.length; i++) {
            options += values[i].uncontrolled;
            if (i != values.length - 1) {
                options += ", ";
            }
        }
        return options;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "uncontrolled='" + uncontrolled + '\'' +
                ", controlled='" + controlled + '\'' +
                '}';
    }
}

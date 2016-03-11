package com.epam;

import javafx.scene.input.InputMethodTextRun;

/**
 * Created by m18 on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        for (MyDayOfWeek m:MyDayOfWeek.values()) {
            System.out.println(m.name());
        }
    }
}

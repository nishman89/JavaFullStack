package com.sparta.pcw.fileio;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class App {
    public static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.setLevel(Level.ALL);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        consoleHandler.setFormatter(new XMLFormatter());

        LOGGER.addHandler(consoleHandler);

        LOGGER.log(Level.SEVERE, "This is a Severe message");  // highest value
        LOGGER.log(Level.WARNING, "This is a Warning message");
        LOGGER.log(Level.INFO, "This is an Info message");
        LOGGER.log(Level.CONFIG, "This is a Config message");
        LOGGER.log(Level.FINE, "This is a Fine message");
        LOGGER.log(Level.FINER, "This is a Finer message");
        LOGGER.log(Level.FINEST, "This is a Finest message");   // lowest value
    }
}

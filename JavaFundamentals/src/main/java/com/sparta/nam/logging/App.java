package com.sparta.nam.logging;

import java.util.logging.*;

public class App {

    public static final Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        LOGGER.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logFile.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        LOGGER.setUseParentHandlers(false);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        consoleHandler.setFormatter(new XMLFormatter());
        LOGGER.addHandler(consoleHandler);
        LOGGER.log(Level.SEVERE, "SEVERE is a message level indicating a potential problem"); // highest
        LOGGER.log(Level.WARNING, "WARNING is a message level indicating a potential problem");
        LOGGER.log(Level.INFO, "INFO is a message level for informational messages");
        LOGGER.log(Level.CONFIG, "CONFIG is a message level for static configuration messages");
        LOGGER.log(Level.FINE, "FINE is a message level providing tracing information");
        LOGGER.log(Level.FINER, "FINER indicates a fairly detailed tracing message");
        LOGGER.log(Level.FINEST, "FINEST indicates a highly detailed tracing message");   // lowest

        // Console handler
    }
}

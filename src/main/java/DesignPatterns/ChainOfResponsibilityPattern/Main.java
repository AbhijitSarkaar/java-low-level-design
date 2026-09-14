package DesignPatterns.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("main");

        FatalLogProcessor fatalLogger = new FatalLogProcessor(LogProcessor.FATAL, null);
        ErrorLogProcessor errorLogger = new ErrorLogProcessor(LogProcessor.ERROR, fatalLogger);
        InfoLogProcessor infoLogger = new InfoLogProcessor(LogProcessor.INFO, errorLogger);
        DebugLogProcessor logger = new DebugLogProcessor(LogProcessor.DEBUG, infoLogger);

        logger.logMessage(LogProcessor.DEBUG, "this is a debug message");
        logger.logMessage(LogProcessor.INFO, "this is a info message");
        logger.logMessage(LogProcessor.ERROR, "this is a error message");
        logger.logMessage(LogProcessor.FATAL, "this is a fatal message");

    }

}

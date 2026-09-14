package DesignPatterns.ChainOfResponsibilityPattern;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor =  nextLogProcessor;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogProcessor.write(): " + message);
    }

}

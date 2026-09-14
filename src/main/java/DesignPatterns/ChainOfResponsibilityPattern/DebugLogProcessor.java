package DesignPatterns.ChainOfResponsibilityPattern;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogProcessor.write(): " + message);
    }
}

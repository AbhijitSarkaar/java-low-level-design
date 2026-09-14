package DesignPatterns.ChainOfResponsibilityPattern;

public class FatalLogProcessor extends LogProcessor {

    public FatalLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor =  nextLogProcessor;
    }

    @Override
    protected void write(String message) {
        System.out.println("FatalLogProcessor.write(): " + message);
    }

}



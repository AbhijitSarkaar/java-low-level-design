package DesignPatterns.ChainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor =  nextLogProcessor;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogProcessor.write(): " + message);
    }

}

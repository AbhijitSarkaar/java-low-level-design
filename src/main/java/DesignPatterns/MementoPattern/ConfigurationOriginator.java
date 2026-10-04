package DesignPatterns.MementoPattern;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(height, width);
    }

    public void restoreMemento(ConfigurationMemento toBeRestoredMemento) {
        this.height = toBeRestoredMemento.height;
        this.width = toBeRestoredMemento.width;
    }
}

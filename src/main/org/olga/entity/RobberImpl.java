package org.olga.entity;

public class RobberImpl implements Robber {
    private String name;
    private int level;

    public RobberImpl(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Robber's name: " + getName() + "; Robber's level: " + getLevel() + ".";
    }
}

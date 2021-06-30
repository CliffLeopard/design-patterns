package com.cliff.patterns.factory;

public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}

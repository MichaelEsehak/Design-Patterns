package com.design.pattern.facade;

public class AnimalFacade {

    Animal cat=new Cat();
    Animal dog=new Dog();
    Animal lion=new Lion();

    public void feedAnimals(){
        lion.feed();
        cat.feed();
        dog.feed();
    }
}

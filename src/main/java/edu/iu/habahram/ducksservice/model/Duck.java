package edu.iu.habahram.ducksservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public abstract class Duck {
//    private FlyBehavior flyBehavior;
//    private QuackBehavior quackBehavior;

    @Id
    private int id;

    private DuckType type;

    public Duck() {

    }
    public Duck(int id, DuckType type) {
        this.id = id;
        this.type = type;
    }

//    public FlyBehavior getFlyBehavior() {
//        return flyBehavior;
//    }
//
//    public void setFlyBehavior(FlyBehavior flyBehavior) {
//        this.flyBehavior = flyBehavior;
//    }
//
//    public QuackBehavior getQuackBehavior() {
//        return quackBehavior;
//    }
//
//    public void setQuackBehavior(QuackBehavior quackBehavior) {
//        this.quackBehavior = quackBehavior;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DuckType getType() {
        return type;
    }

    public void setType(DuckType type) {
        this.type = type;
    }

//    public int[] performFly(int[] positionBefore) {
//        return flyBehavior.fly(positionBefore);
//    }
//
//    public void performQuack() {
//        quackBehavior.quack();
//    }
}

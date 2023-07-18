package Homework;

import java.util.Objects;

/**
 * Cat
 */
public class Cat {

    String name;
    String kindOf;
    String type;
    boolean IsHungry;

    public Cat(String name, String kindOf, String type, boolean IsHungry) {
        this.name = name;
        this.kindOf = kindOf;
        this.type = type;
        this.IsHungry = IsHungry;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s " + (IsHungry ? "(Голоден)" : "(Не голоден)"), name, kindOf, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) && kindOf.equals(cat.kindOf) && type.equals(cat.type) && IsHungry == cat.IsHungry;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, kindOf, type, IsHungry);
    }
}
package com.company;

import com.company.animals.Animal;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Objects;

public class Aviary<T extends Animal>  {
    private HashMap<String, T> animals;
    public OptionsAviary size;

    @Override
    public boolean equals(Object o) {
        if(this.getClass() == o.getClass()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animals);
    }

    public void AddAnimal(String key, T value){
        animals.put(key, value);
    }

    public void DeleteAnimal(String key, T value){
        animals.replace(key, value);
    }

    public T GetReferenceAnimal(String key){
        return animals.get(key);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tya.arraysandcollection.controller;

import java.util.ArrayList;
import java.util.List;
import org.tya.arraysandcollection.entity.AbstractAnimal;
import org.tya.arraysandcollection.entity.IAnimal;

/**
 *
 * @author student
 */
public class AnimalController {

    public void order(List<AbstractAnimal> _animals, IAnimalComparator _comparator) {
        
        int k;
        for (int m = _animals.size(); m >= 0; m--) {
            
            for (int i = 0; i < _animals.size() - 1; i++) {
                
                k = i + 1;
                /*if (demoSortExpression(_animals.get(i), _animals.get(i + 1))) {
                    swapAnimals(i, k, _animals);
                }*/
                
                if (_comparator.compare(_animals.get(i), _animals.get(i + 1))) {
                    swapAnimals(i, k, _animals);
                }
            }
        }
    }
    
    private void swapAnimals(int i, int j, List<AbstractAnimal> _animals) {
  
        AbstractAnimal tmpAnimal = null;
        tmpAnimal = _animals.get(i);
        _animals.set(i, _animals.get(i + 1));
        _animals.set(j, tmpAnimal);
    }
    
    /*private boolean demoSortExpression(AbstractAnimal a1, AbstractAnimal a2){
        return a1.weight > a2.weight;
    }*/
}

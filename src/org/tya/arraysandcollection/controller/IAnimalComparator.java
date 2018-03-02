/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tya.arraysandcollection.controller;

import org.tya.arraysandcollection.entity.AbstractAnimal;

/**
 *
 * @author student
 */
public interface IAnimalComparator {
    
    boolean compare(AbstractAnimal a1, AbstractAnimal a2);
}

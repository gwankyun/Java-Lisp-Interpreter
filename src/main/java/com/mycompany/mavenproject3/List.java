/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import com.google.common.collect.ImmutableList;

/**
 *
 * @author ljqic
 */
public class List extends Cons {

    private Cons value;

    public Cons getValue() {
        return value;
    }

    public void setValue(Cons value) {
        this.value = value;
    }
    
    public static Cons makeCons(ImmutableList<Sexpression> list) {
        if (list.isEmpty()) {
            return new Nil();
        } else if (list.size() == 1) {
            return new Cons(list.get(0), new Nil());
        } else {
            Sexpression head = list.get(0);
            ImmutableList<Sexpression> tail = list.subList(1, list.size() - 1);
            return new Cons(head, makeCons(tail));
        }
    }

    public static Cons makeList(Sexpression... args) {
        ImmutableList<Sexpression> list = ImmutableList.copyOf(args);
        return makeCons(list);
    }

    public List(Sexpression... args) {
        ImmutableList<Sexpression> list = ImmutableList.copyOf(args);
//        setValue(makeCons(list));
        this.value = makeCons(list);
    }
}

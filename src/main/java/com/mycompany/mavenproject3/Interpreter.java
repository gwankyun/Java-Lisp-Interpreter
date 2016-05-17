/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author ljqic
 */
public class Interpreter {

    public static void interp(Sexpression sexpression) {
        if (sexpression instanceof Atom) {
            Atom atom = (Atom) sexpression;
            System.out.println(atom.getValue());
        } else if (sexpression instanceof List) {
            if (sexpression instanceof Nil) {
                System.out.println("nil");
            } else {
                List list = (List) sexpression;
                interp(list.getHead());
                interp(list.getTail());
            }
        }
    }

    public static void main(String[] args) {
        List list = new List(new Atom("0"),
                new List(new Atom("1"),
                        new List(new Atom("2"), new Nil())));
        interp(list);
    }
}

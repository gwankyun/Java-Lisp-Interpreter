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
public class Interpreter {

    public static void interp(Sexpression sexpression) {
//        System.out.println("com.mycompany.mavenproject3.Interpreter.interp()");
        if (sexpression instanceof List) {
            System.out.println("What the fuck?");
            List list = (List) sexpression;
            interp(list.getValue().getHead());
            interp(list.getValue().getTail());
        }  else if (sexpression instanceof Cons) {
            if (sexpression instanceof Nil) {
                System.out.println("nil");
            } else {
                Cons list = (Cons) sexpression;
                interp(list.getHead());
                interp(list.getTail());
            }
        } else if (sexpression instanceof Atom) {
            Atom atom = (Atom) sexpression;
            System.out.println(atom.getValue());
        }
    }

    public static Cons makeListHelp(ImmutableList<Sexpression> list) {
//        ImmutableList<Sexpression> list = ImmutableList.copyOf(sexpressions);
        if (list.isEmpty()) {
            return new Nil();
        }
        if (list.size() == 1) {
            return new Cons(list.get(0), new Nil());
        } else {
            return new Cons(list.get(0), makeListHelp(list.subList(1, list.size() - 1)));
        }
    }

    public static Cons makeList(Sexpression... sexpressions) {
        ImmutableList<Sexpression> list = ImmutableList.copyOf(sexpressions);
        return makeListHelp(list);
    }

    public static void main(String[] args) {
        Cons list = new Cons(new Atom("0"),
                new Cons(new Atom("1"),
                        new Cons(new Atom("2"),
                                new Cons(new Atom("3"), new Nil()))));
        interp(list);
//        ImmutableList<String> s = ImmutableList.copyOf(args);
//        Cons s = new List(new Atom("1"), new Atom("2"), new Atom("3"));
        Sexpression[] sexp = {new Atom("1"), new Atom("2"), new Atom("3")};
//        System.out.println(ImmutableList.copyOf(sexp).size());
        List s = new List(new Atom("1"), new Atom("2"), new Atom("3"), new Atom("4"));
//        System.out.println((Atom)s.getHead());
        interp(s);
    }
}

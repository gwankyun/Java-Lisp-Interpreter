/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ljqic
 */
public class List extends Sexpression {

    private Sexpression head;
    private List tail;

    public List(Sexpression head, List tail) {
        this.head = head;
        this.tail = tail;
    }

    public List() {
    }

    public List(Sexpression... args) {
        ArrayList<Sexpression> head = new ArrayList<>();
        ArrayList<Sexpression> tail = new ArrayList<>();
        int i = 0;
        for (Sexpression arg : args) {
            if (i == 0) {
                head.add(arg);
            } else {
                tail.add(arg);
            }
        }
    }

    public Sexpression getHead() {
        return head;
    }

    public void setHead(Sexpression head) {
        this.head = head;
    }

    public List getTail() {
        return tail;
    }

    public void setTail(List tail) {
        this.tail = tail;
    }

}

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
public class Cons extends Sexpression {

    private Sexpression head;
    private Cons tail;

    public Cons(Sexpression head, Cons tail) {
        this.head = head;
        this.tail = tail;
    }

    public Cons() {
    }

    public Sexpression getHead() {
        return head;
    }

    public void setHead(Sexpression head) {
        this.head = head;
    }

    public Cons getTail() {
        return tail;
    }

    public void setTail(Cons tail) {
        this.tail = tail;
    }

}

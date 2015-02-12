/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackadt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author introduccion02
 */
public class miPila implements StackADT {

    public ArrayList<Object> list;

    public miPila(){
        this.list=new ArrayList();
    }
    @Override
    public void push(Object elem) {
        list.add(elem);
    }

    @Override
    public Object pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public Object peek() {
        Object res = list.get(list.size() - 1);

        return res;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            cad.append("\n" + list.get(i));
        }

        return cad.toString();
    }

 
}
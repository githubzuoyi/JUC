package com.feizuo.juc.juc_learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test1 class
 *
 * @author 左飞
 * @date 2019/4/22
 */
public class Test1 {

    public void itr(Iterator i) {

        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Collection c = new ArrayList();
        ((ArrayList) c).add(1);
        ((ArrayList) c).add(2);
        ((ArrayList) c).add(3);
        ArrayList a = new ArrayList(c);
        t1.itr(a.iterator());
    }
}

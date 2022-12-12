package com.imt.training.java;

import java.util.*;

public class ThreadSafeObjects {
    public static void main(String[] args) {


        //  Not Thread Safe Objects
        ArrayList arr = new ArrayList();
        HashMap m  = new HashMap();
        Date d = new Date();
        StringBuilder sb = new StringBuilder();

        //  Thread safe Objects
        Vector v = new Vector();
        Hashtable t = new Hashtable();
        StringBuffer b =new StringBuffer();

    }
}

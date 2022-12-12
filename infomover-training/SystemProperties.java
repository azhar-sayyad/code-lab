package com.imt.training.java;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Enumeration enumeration = props.propertyNames();

        while (enumeration.hasMoreElements()){
            String prop =(String) enumeration.nextElement();
            System.out.println(prop+"-----"+System.getProperty(prop));
        }
    }
}
/*
*   System Properties
*   -Dprops = Yabadabadoo
 */

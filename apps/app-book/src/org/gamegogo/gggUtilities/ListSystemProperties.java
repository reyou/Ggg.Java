package org.gamegogo.gggUtilities;

import java.util.Enumeration;
import java.util.Properties;
// Is it possible to detect processor architecture in java?
// https://stackoverflow.com/questions/15240835/is-it-possible-to-detect-processor-architecture-in-java
public class ListSystemProperties {
    public static void main(String args[]){
        Properties properties = System.getProperties();
        Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()){
            Object key = keys.nextElement();
            Object value = properties.get(key);
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
            System.out.println();
        }
    }
}

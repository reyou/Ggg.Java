package org.gamegogo.gggUtilities;

import java.util.Enumeration;
import java.util.Properties;
// Is it possible to detect processor architecture in java?
// https://stackoverflow.com/questions/15240835/is-it-possible-to-detect-processor-architecture-in-java
/*The System class contains several useful class fields and methods.
It cannot be instantiated.
Among the facilities provided by the System class are standard input,
standard output, and error output streams; access to externally defined properties
and environment variables; a means of loading files and libraries; and a utility
method for quickly copying a portion of an array.*/
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

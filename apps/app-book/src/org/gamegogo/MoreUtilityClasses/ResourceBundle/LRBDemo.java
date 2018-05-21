package org.gamegogo.MoreUtilityClasses.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

class LRBDemo {
    public static void main(String args[]) {
// Load the default bundle.
        ResourceBundle rd = ResourceBundle.getBundle("org.gamegogo.MoreUtilityClasses.ResourceBundle.SampleRB");
        System.out.println("English version: ");
        System.out.println("String for Title key : " + rd.getString("title"));
        System.out.println("String for StopText key: " + rd.getString("StopText"));
        System.out.println("String for StartText key: " + rd.getString("StartText"));
// Load the German bundle.
        rd = ResourceBundle.getBundle("org.gamegogo.MoreUtilityClasses.ResourceBundle.SampleRB", Locale.GERMAN);
        System.out.println("\nGerman version: ");
        System.out.println("String for Title key : " + rd.getString("title"));
        System.out.println("String for StopText key: " + rd.getString("StopText"));
        System.out.println("String for StartText key: " + rd.getString("StartText"));
    }
}

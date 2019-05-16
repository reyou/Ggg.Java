package org.gamegogo.enumAutoboxingAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationSamples {

    /*An annotation is created through a mechanism based on the interface.
    Let’s begin with an example. Here is the declaration for an annotation
    called MyAnno:*/
    // A simple annotation type.
    @interface MyAnno {
        String str();

        int val();
    }

    /*The following version of MyAnno uses @Retention to specify the
    RUNTIME retention policy. Thus, MyAnno will be available to the
    JVM during program execution.*/
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnno2 {
        String str();

        int val();
    }

    // Annotate a method.
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {

    }
}

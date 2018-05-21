package org.gamegogo.introducingClasses;

class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /*It is important to understand that finalize( ) is only called just prior to garbage collection.
It is not called when an object goes out-of-scope, for example. This means that you cannot
know when—or even if—finalize( ) will be executed. Therefore, your program should
provide other means of releasing system resources, etc., used by the object. It must not
rely on finalize( ) for normal program operation.*/
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize has been called!");
    }
}

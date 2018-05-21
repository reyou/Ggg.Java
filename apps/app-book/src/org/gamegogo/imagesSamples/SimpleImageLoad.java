package org.gamegogo.imagesSamples;

/*
 * <applet code="SimpleImageLoad" width=400 height=345>
 * <param name="img" value="Lilies.jpg">
 * </applet>
 */

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

/*An applet is a small program that is intended not to be run on its own, but
rather to be embedded inside another application.
The Applet class must be the superclass of any applet that is to be embedded
in a Web page or viewed by the Java Applet Viewer. The Applet class provides
a standard interface between applets and their environment.*/
public class SimpleImageLoad extends Applet {
    /*The abstract class Image is the superclass of all classes that represent
    graphical images. The image must be obtained in a platform-specific manner.*/
    Image img;

    /*Indicates that a method declaration is intended to override a method declaration
    in a supertype. If a method is annotated with this annotation type compilers are
    required to generate an error message unless at least one of the following conditions hold:
    1- The method does override or implement a method declared in a supertype.
    2- The method has a signature that is override-equivalent to that of any public method
    declared in Object.*/
    @Override
    /*Called by the browser or applet viewer to inform this applet that it has been loaded
    into the system. It is always called before the first time that the start method is called.
A subclass of Applet should override this method if it has initialization to perform.
For example, an applet with threads would use the init method to create the threads and the
destroy method to kill them. The implementation of this method provided by the Applet class
does nothing.*/
    public void init() {
        /*Gets the URL of the document in which this applet is embedded.*/
        URL url = getDocumentBase();
        /*Returns the value of the named parameter in the HTML tag.*/
        String name = getParameter("img");
        /*Returns an Image object that can then be painted on the screen.
        The url argument must specify an absolute URL. The name argument is a
        specifier that is relative to the url argument. This method always returns
        immediately, whether or not the image exists. When this applet attempts to draw
        the image on the screen, the data will be loaded. The graphics primitives that
        draw the image will incrementally paint on the screen.*/
        img = getImage(url, name);
    }

    @Override
    /*Paints the container. This forwards the paint to any lightweight components
    that are children of this container. If this method is reimplemented,
    super.paint(g) should be called so that lightweight components are properly rendered.
    If a child component is entirely clipped by the current clipping setting in g, paint()
    will not be forwarded to that child.*/
    public void paint(Graphics g) {
        /*Draws as much of the specified image as is currently available. The image is
        drawn with its top-left corner at (x, y) in this graphics context's coordinate space.
        Transparent pixels in the image do not affect whatever pixels are already there.*/
        g.drawImage(img, 0, 0, this);
    }
}


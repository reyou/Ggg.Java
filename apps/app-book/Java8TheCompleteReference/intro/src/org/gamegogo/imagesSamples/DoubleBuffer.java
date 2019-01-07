package org.gamegogo.imagesSamples;
/*
 * <applet code=DoubleBuffer width=250 height=250>
 * </applet>
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/*An event which indicates that a mouse action occurred in a component.
A mouse action is considered to occur in a particular component if and only
if the mouse cursor is over the unobscured part of the component's bounds when
the action happens. For lightweight components, such as Swing's components,
mouse events are only dispatched to the component if the mouse event type has
been enabled on the component. A mouse event type is enabled by adding the appropriate
mouse-based EventListener to the component (MouseListener or MouseMotionListener),
or by invoking Component.enableEvents(long) with the appropriate mask parameter
(AWTEvent.MOUSE_EVENT_MASK or AWTEvent.MOUSE_MOTION_EVENT_MASK). If the mouse event
type has not been enabled on the component, the corresponding mouse events are dispatched
to the first ancestor that has enabled the mouse event type.*/


public class DoubleBuffer extends Applet {
    int gap = 3;
    int mx, my;
    boolean flicker = true;
    Image buffer = null;
    int w, h;

    @Override
    public void init() {
        /*public java.awt.Dimension getSize()
Returns the size of this component in the form of a Dimension object.
The height field of the Dimension object contains this component's height,
and the width field of the Dimension object contains this component's width.*/
        /*public class Dimension
extends java.awt.geom.Dimension2D
implements java.io.Serializable
The Dimension class encapsulates the width and height of a component
(in integer precision) in a single object. The class is associated with
certain properties of components. Several methods defined by the Component class
and the LayoutManager interface return a Dimension object.*/
        Dimension d = getSize();
        w = d.width;
        h = d.height;
        if (w <= 0) {
            w = 640;
        }
        if (h <= 0) {
            h = 480;
        }
        buffer = createImage(w, h);
        /*public void addMouseMotionListener(@Nullable java.awt.event.MouseMotionListener l)
Adds the specified mouse motion listener to receive mouse motion events from this
component. If listener l is null, no exception is thrown and no action is performed.*/
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            /*Invoked when a mouse button is pressed on a component and then dragged.
            Mouse drag events will continue to be delivered to the component where the first
            originated until the mouse button is released (regardless of whether the mouse
            position is within the bounds of the component).*/
            public void mouseDragged(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = false;
                /*public void repaint()
Repaints this component.
If this component is a lightweight component, this method causes a call to this component's
paint method as soon as possible. Otherwise, this method causes a call to this component's
update method as soon as possible.*/
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = true;
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Graphics screengc = null;
        if (!flicker) {
            screengc = g;
            /*public abstract java.awt.Graphics getGraphics()
Creates a graphics context for drawing to an off-screen image.
This method can only be called for off-screen images.*/
            g = buffer.getGraphics();
        }
        /*
Sets this graphics context's current color to the specified color.
All subsequent graphics operations using this graphics context use
this specified color.*/
        g.setColor(Color.blue);
        /*Fills the specified rectangle. The left and right edges of the rectangle
        are at x and x + width - 1. The top and bottom edges are at y and y + height - 1.
        The resulting rectangle covers an area width pixels wide by height pixels tall.
        The rectangle is filled using the graphics context's current color.*/
        g.fillRect(0, 0, w, h);
        g.setColor(Color.red);
        for (int i = 0; i < w; i += gap) {
            g.drawLine(i, 0, w - i, h);
        }
        for (int i = 0; i < h; i += gap) {
            g.drawLine(0, i, w, h - i);
        }
        g.setColor(Color.black);
        /*Draws the text given by the specified string, using this graphics context's
        current font and color. The baseline of the leftmost character is at position
        (x, y) in this graphics context's coordinate system.*/
        g.drawString("Press mouse button to double buffer", 10, h / 2);
        g.setColor(Color.yellow);
        g.fillOval(mx - gap, my - gap, gap * 2 + 1, gap * 2 + 1);
        if (!flicker) {
            screengc.drawImage(buffer, 0, 0, null);
        }
    }

    @Override
    /*public void update(Graphics g)
Description copied from class: Container Updates the container. This forwards the update
to any lightweight components that are children of this container. If this method is
reimplemented, super.update(g) should be called so that lightweight components are properly
rendered. If a child component is entirely clipped by the current clipping setting in g,
update() will not be forwarded to that child.*/
    public void update(Graphics g) {
        paint(g);
    }
}
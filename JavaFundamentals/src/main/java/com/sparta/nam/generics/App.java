package com.sparta.nam.generics;

import com.sparta.nam.memorymodel.Person;

public class App {
    public static void main(String[] args) {
        IntegerRectangle iRect = new IntegerRectangle(2,4);
        System.out.println("iRect height: " + iRect.getHeight());
        System.out.println("iRect width: " + iRect.getWidth());
        System.out.println();

        DoubleRectangle dRect = new DoubleRectangle(2.0,4.0);
        System.out.println("dRect height: " + dRect.getHeight());
        System.out.println("dRect width: " + dRect.getWidth());
        System.out.println();

        ObjectRectangle oIRect = new ObjectRectangle(2,4);
        ObjectRectangle oDRect = new ObjectRectangle(2.0,4.0);
        System.out.println("Area of oDrect " + (Double)oDRect.getHeight() * (Double)oDRect.getWidth());
        System.out.println("Area of oIrect " + (Integer)oIRect.getHeight() * (Integer)oIRect.getWidth());

        System.out.println();

        GenericRectangle<Integer> gIRect = new GenericRectangle<>(2, 4);
        GenericRectangle<Double> gDRect = new GenericRectangle<>(2.0, 4.0);
        System.out.println("Area of gIRect: " +  (gIRect.getHeight() * gIRect.getWidth()));
        System.out.println("Area of gDRect: " +  (gDRect.getHeight() * gDRect.getWidth()));
    }
}

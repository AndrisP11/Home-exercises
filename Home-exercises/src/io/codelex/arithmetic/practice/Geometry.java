package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
            return Math.PI * Math.pow(radius.doubleValue(), 2);

       // throw new NoCodeWrittenException();
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
       // throw new NoCodeWrittenException();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.doubleValue()*h.doubleValue()/2;
        //throw new NoCodeWrittenException();
    }
}

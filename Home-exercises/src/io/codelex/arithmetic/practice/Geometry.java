package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        return radius.pow(2).multiply(BigDecimal.valueOf(Math.PI));
        // throw new NoCodeWrittenException();
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
        // throw new NoCodeWrittenException();
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).divide(new BigDecimal(2));
        //throw new NoCodeWrittenException();
    }
}

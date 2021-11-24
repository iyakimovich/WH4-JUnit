package org.innay;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isValid() {
        return Triangle. isThisTriangle(sideA, sideB, sideA);
    }

    public double gerArea() {
        return Triangle.getArea(sideA, sideB, sideA);
    }

    public static boolean isThisTriangle(int sideA, int sideB, int sideC) {
        if ((sideA <= 0) || (sideB <= 0) || (sideC <= 0)){
            return false;
        }
        return (sideA < (sideB + sideC)) && (sideB < (sideA + sideC)) && (sideC < (sideA + sideB));
    }

    public static long getArea(int sideA, int sideB, int sideC) {
        double s = (double)(sideA + sideB + sideC) / 2;
        return Math.round(Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
    }
}

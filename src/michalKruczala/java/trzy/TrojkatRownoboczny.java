package trzy;

import intefrejsy.Metodki;
import model.Figura;

public class TrojkatRownoboczny extends Figura {


    public TrojkatRownoboczny(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }


    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        int polowaObwodu = (side1 + side2 + side3) / 2;
        return Math.sqrt(polowaObwodu * (polowaObwodu - side2) * (polowaObwodu - side1) * (polowaObwodu - side3));
    }

    @Override
    public String getName() {
        return "Trojkat Równoboczny";
    }

}

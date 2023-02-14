package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.sql.SQLOutput;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        nakresliCtverec();
        zofka.turnLeft(45);
        zofka.move(150);
        zofka.turnRight(45);
        zofka.turnRight(45);
        zofka.move(150);




        //TODO tady bude kód


    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }
}

package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.sql.SQLOutput;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        nakresliCtverec();
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(45);
        zofka.penDown();
        zofka.move(105);
        zofka.turnRight(90);
        zofka.move(105);

        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(190);
        zofka.penDown();



        nakresliCtverec();

        nakresliNozky();
        zofka.turnLeft(120);
        zofka.move(150);

        nakresliNozky();
        zofka.turnLeft(75);
        zofka.move(105);
        zofka.turnRight(90);
        zofka.move(105);


        //TODO tady bude kód


    }

    private void nakresliNozky() {
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);

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

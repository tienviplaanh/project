/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Throne extends JPanel {

    public static int x1 = 500;
    public static int x2 = x1 + 140;
    public static int x3 = x2 + 140;
    public static int x4 = x3 + 140;
    public static int hd1, hd2, hd3, hd4;

    public static boolean move1 = false;
    public static boolean move2 = false;
    public static boolean move3 = false;
    public static boolean move4 = false;

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public int getHd1() {
        return hd1;
    }

    public int getHd2() {
        return hd2;
    }

    public int getHd3() {
        return hd3;
    }

    public int getHd4() {
        return hd4;
    }

    public static int getX4() {
        return x4;
    }

    public void randomThrone() {
        Random rd = new Random();
        if (move1 == false) {
            hd1 = rd.nextInt(200);
            move1 = true;
        }
        if (move2 == false) {
            hd2 = rd.nextInt(200);
            move2 = true;
        }
        if (move3 == false) {
            hd3 = rd.nextInt(200);
            move3 = true;
        }
        if (move4 == false) {
            hd4 = rd.nextInt(200);
            move4 = true;
        }
    }

    public void paint(Graphics g) {
        randomThrone();

        g.setColor(Color.green);
        g.fillRect(x1, 0, 65, hd1);
        g.setColor(Color.green);
        g.fillRect(x1, hd1 + 100, 65, 500);
        g.setColor(Color.green);
        g.fillRect(x2, 0, 65, hd2);
        g.setColor(Color.green);
        g.fillRect(x2, hd2 + 100, 65, 500);
        g.setColor(Color.green);
        g.fillRect(x3, 0, 65, hd3);
        g.setColor(Color.green);
        g.fillRect(x3, hd3 + 100, 65, 500);
        g.setColor(Color.green);
        g.fillRect(x4, 0, 65, hd4);
        g.setColor(Color.green);
        g.fillRect(x4, hd4 + 100, 65, 500);
    }

    public void giamX() {
        x1--;
        x2--;
        x3--;
        x4--;

    }

    public void loopX() {
        if (x1 == -65) {
            x1 = 500;
            move1 = false;
        }
        if (x2 == -65) {
            x2 = 500;
            move2 = false;
        }
        if (x3 == -65) {
            x3 = 500;
            move3 = false;
        }
        if (x4 == -65) {
            x4 = 500;
            move4 = false;
        }
    }

}

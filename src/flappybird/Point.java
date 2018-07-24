/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

/**
 *
 * @author ADMIN
 */
public class Point {

    private static int score = 0;
    private Bird conchim = new Bird();
    private Throne ongnuoc = new Throne();
    public static boolean bl1 = false;
    public static boolean bl2 = false;
    public static boolean bl3 = false;
    public static boolean bl4 = false;

    public static int getScore() {
        return score;
    }

    public void upScore() {
        if (conchim.getX() + 45 > ongnuoc.getX1() && conchim.getX() < ongnuoc.getX1() + 65) {
            bl1 = true;
        }
        if (bl1 == true && conchim.getX() > ongnuoc.getX1() + 65) {
            score++;
            bl1 = false;
        }
        if (conchim.getX() + 45 > ongnuoc.getX2() && conchim.getX() < ongnuoc.getX2() + 65) {
            bl2 = true;
        }
        if (bl2 == true && conchim.getX() > ongnuoc.getX2() + 65) {
            score++;
            bl2 = false;
        }
        if (conchim.getX() + 45 > ongnuoc.getX3() && conchim.getX() < ongnuoc.getX3() + 65) {
            bl3 = true;
        }
        if (bl3 == true && conchim.getX() > ongnuoc.getX3() + 65) {
            score++;
            bl3 = false;
        }
        if (conchim.getX() + 45 > ongnuoc.getX4() && conchim.getX() < ongnuoc.getX4() + 65) {
            bl4 = true;
        }
        if (bl4 == true && conchim.getX() > ongnuoc.getX4() + 65) {
            score++;
            bl4 = false;
        }

    }

}

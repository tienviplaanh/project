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
public class Die {
sss

    public Bird conchimK = new Bird();
    Throne ongnuocK = new Throne();

    public boolean chet() {
        if (conchimK.getY() + 45 >= 400) {
            return true;
        }
        if (conchimK.getY() <= ongnuocK.getHd1() && (((conchimK.getX() + 45) >= ongnuocK.getX1())) && conchimK.getX() <= (ongnuocK.getX1() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getHd1() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX1() && conchimK.getX() <= (ongnuocK.getX1() + 65))) {
            return true;
        }
        //2
        if (conchimK.getY() <= ongnuocK.getHd2() && (((conchimK.getX() + 45) >= ongnuocK.getX2())) && conchimK.getX() <= (ongnuocK.getX2() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getHd2() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX2() && conchimK.getX() <= (ongnuocK.getX2() + 65))) {
            return true;
        }
        //3
        if (conchimK.getY() <= ongnuocK.getHd3() && (((conchimK.getX() + 45) >= ongnuocK.getX3())) && conchimK.getX() <= (ongnuocK.getX3() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getHd3() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX3() && conchimK.getX() <= (ongnuocK.getX3() + 65))) {
            return true;
        }
        //4
        if (conchimK.getY() <= ongnuocK.getHd4() && (((conchimK.getX() + 45) >= ongnuocK.getX4())) && conchimK.getX() <= (ongnuocK.getX4() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getHd4() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX4() && conchimK.getX() <= (ongnuocK.getX4() + 65))) {
            return true;
        }
        return false;
    }
}

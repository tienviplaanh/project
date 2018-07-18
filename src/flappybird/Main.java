/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Main extends JFrame implements KeyListener, MouseListener {

    JPanel jp = new JPanel();
    private BackGround bg = new BackGround();
    Bird b = new Bird();

    public Main() {

        setSize(500, 500);

        setVisible(true);
        setLocation(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        add(bg);
        addMouseListener(this);
        addKeyListener(this);

//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton bt1 = new JButton("Pause");
//        JButton bt2 = new JButton("Pause");
//        JButton bt3 = new JButton("Pause");
//        setResizable(true);
//        // bt1.setLocation(150, 150);
//        bt1.setSize(50, 50);
//        bt1.setLocation(50, 50);
//        bt2.setSize(50, 50);
//        bt2.setLocation(100, 100);
//        bt3.setSize(50, 50);
//        bt3.setLocation(150, 150);
//        jp.add(bt2);
//        jp.add(bt1);
//        jp.add(bt3);
//
//        add(jp, BorderLayout.SOUTH);
//        addKeyListener(this);
//        bt1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "Null");
//            }
//        });
        // addKeyListener(this);
//
    }

    public static void main(String[] args) {
        Main m = new Main();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // b.birdJumps();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        b.birdJumps();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //  b.birdJumps();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        b.birdJumps();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // b.birdJumps();
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

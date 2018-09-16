/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import View.MainFrame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
import javax.swing.JFrame;

/**
 *
 * @author jarkom
 */
public class TestMainFrame{
    public static void main(String[] args) {
        MainFrame MF = new MainFrame();
        MF.setSize(600, 500);
        MF.setVisible(true);
        MF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

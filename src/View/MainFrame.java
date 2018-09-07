/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jarkom
 */
public class MainFrame extends JFrame {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem exitMenuItem;

    public MainFrame() throws HeadlessException {
        init();
    }


    public void init() {
        menuBar = new JMenuBar();
        this.setTitle("Main Frame");
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
    }

}

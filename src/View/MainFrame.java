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
    //Mendeklarasikan attribut menuBar dengan tipe data JMenuBar
    JMenu fileMenu;
    //Mendeklarasikan attribut fileMenu dengan tipe data fileMenu
    JMenuItem exitMenuItem;
    //Mendeklarasikan attribut exitMenuItem dengan tipe data JMenuItem

    public MainFrame() throws HeadlessException {
        /**
         * Membuat method constructor kosong MainFrame()
         */
        init();
        //Memanggil method init()
    }


    public void init() {
         /**
         * Membuat method init dengan tipe data void, method ini berguna untuk menginput
         * nilai dari seluruh attribut
         */
        menuBar = new JMenuBar();
        //Membuat objek baru menuBar dengan tipe data JMenuBar
        this.setTitle("Main Frame");
        //Mengisi/Mengeset setTitle dengan "Main Frame"
        fileMenu = new JMenu("File");
        //Membuat objek baru fileMenu dengan tipe data JMenu dengan isi parameternya "File"
        exitMenuItem = new JMenuItem("Exit");
        //Membuat objek baru exitMenuItem dengan tipe data JMenuItem dengan isi parameter "Exit"
        fileMenu.add(exitMenuItem);
        //Menambahkan exitMenuItem pada fileMenu
        menuBar.add(fileMenu);
        //Menambahkan fileMenu pada menuBar
        this.setJMenuBar(menuBar);
        //Mengisi/Mengeset setJMenuBar dengan menuBar
    }

}

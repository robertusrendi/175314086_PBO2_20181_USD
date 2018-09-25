/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jarkom
 */
public class MainFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    //Mendeklarasikan attribut menuBar dengan tipe data JMenuBar
    JMenu fileMenu;
    //Mendeklarasikan attribut fileMenu dengan tipe data fileMenu
    JMenuItem exitMenuItem;
    //Mendeklarasikan attribut exitMenuItem dengan tipe data JMenuItem
    JMenuItem tambahPasien;
    JMenuItem tambahAntrian;
    JLabel teks;

    public MainFrame() {
        /**
         * Membuat method constructor kosong MainFrame()
         */
        init();
        //Memanggil method init()
    }

    public void init() {
        /**
         * Membuat method init dengan tipe data void, method ini berguna untuk
         * menginput nilai dari seluruh attribut
         */
        menuBar = new JMenuBar();
        //Membuat objek baru menuBar dengan tipe data JMenuBar
        this.setTitle("Main Frame");
        //Mengisi/Mengeset setTitle dengan "Main Frame"
        fileMenu = new JMenu("File");
        //Membuat objek baru fileMenu dengan tipe data JMenu dengan isi parameternya "File"
        tambahPasien = new JMenuItem("Tambah Pasien");
        tambahAntrian = new JMenuItem("Tambah Antrian");
        exitMenuItem = new JMenuItem("Exit");
        //Membuat objek baru exitMenuItem dengan tipe data JMenuItem dengan isi parameter "Exit"
        teks = new JLabel("-Selamat Datang di Klinik Swa-");
        //Membuat method baru Nama dengan tipe data JLabel dan mengisinya dengan "Nama : " 
        teks.setFont(new Font(null, Font.CENTER_BASELINE, 40));
        teks.setBounds(100, 200, 200, 100);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(teks);
        //Menambahkan Nama
        fileMenu.add(tambahPasien);
        fileMenu.add(tambahAntrian);
        //Menambahkan exitMenuItem pada fileMenu
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        //Menambahkan fileMenu pada menuBar
        this.setJMenuBar(menuBar);

        //Mengisi/Mengeset setJMenuBar dengan menuBar
        exitMenuItem.addActionListener(this);
        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahPasien) {
            DaftarPasienBaruDialog test = new DaftarPasienBaruDialog("Dialog Baru");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (e.getSource() == tambahAntrian) {
            DaftarAntrianDialog test = new DaftarAntrianDialog("Latihan Dialog");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }

    }

}

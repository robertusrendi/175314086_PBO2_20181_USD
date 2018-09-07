/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarAntrianDialog extends javax.swing.JDialog {
    JMenuBar menuBar;
    JMenu fileMenu;
    JLabel judulLabel;
    JLabel namaLabel;
    JLabel nomerRM;
    JLabel Alamat;
    JLabel Nama;
    JTextField namaText;
    JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        
        this.setLayout(null);
        judulLabel = new JLabel("Form Daftar Antrian");
        judulLabel.setBounds(80, 15, 200, 30);
        this.add(judulLabel);
        

        nomerRM = new JLabel("Nomor RM : ");
        nomerRM.setBounds(20, 50, 100, 30);
        this.add(nomerRM);
        
        Nama = new JLabel("Nama : ");
        Nama.setBounds(20, 90, 100, 30);
        this.add(Nama);
        
        Alamat = new JLabel("Alamat : ");
        Alamat.setBounds(20, 130, 100, 30);
        this.add(Alamat);
        
        namaText = new JTextField();
        namaText.setBounds(120, 50, 100, 30);
        this.add(namaText);
        
        namaText = new JTextField();
        namaText.setBounds(120, 90, 100, 30);
        this.add(namaText);
        
        namaText = new JTextField();
        namaText.setBounds(120, 130, 100, 30);
        this.add(namaText);
        
        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(120, 200, 100, 30);
        this.add(saveButton);
        
        
    }

}

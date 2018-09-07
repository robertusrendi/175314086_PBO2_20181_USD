/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JFrame {

    JLabel judulLabel;
    JLabel namaLabel;
    JLabel Alamat;
    JLabel Nama;
    JTextField namaText;
    JButton saveButton;

    public DaftarPasienBaruDialog() {
        init();
    }
    
    public DaftarPasienBaruDialog(String title){
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("Form Daftar Antrian");
        judulLabel.setBounds(80, 15, 200, 30);
        this.add(judulLabel);
        
        Nama = new JLabel("Nama : ");
        Nama.setBounds(20, 50, 100, 30);
        this.add(Nama);
        
        Alamat = new JLabel("Alamat : ");
        Alamat.setBounds(20, 90, 100, 30);
        this.add(Alamat);
        
        namaText = new JTextField();
        namaText.setBounds(120, 50, 100, 30);
        this.add(namaText);
        
        namaText = new JTextField();
        namaText.setBounds(120, 90, 100, 30);
        this.add(namaText);
        
        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(120, 150, 100, 30);
        this.add(saveButton);
    }

}

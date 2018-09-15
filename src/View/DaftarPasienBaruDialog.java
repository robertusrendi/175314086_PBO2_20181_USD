/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JFrame implements ActionListener {

    /**
     * private JLabel judulLabel; private JLabel namaLabel; private JLabel
     * alamatLabel; private JLabel nikLabel; private JLabel tanggalalhirLabel;
     * private JTextField namaText; private JTextField alamatText; private
     * JTextField nikText; private JRadioButton lakiRadio; private JRadioButton
     * perempuanRadio; private JComboBox tanggalCombo; private JComboBox
     * bulanCombo; private JComboBox tahunCombo; private JButton tambahButton;
     */
    JLabel judulLabel;
    //Mendeklarasikan attribut judulLabel dengan tipe data JLabel
    JLabel namaLabel;
    //Mendeklarasikan attribut namaLabel dengan tipe data JLabel
    JLabel AlamatLabel;
    //Mendeklarasikan attribut ALamat dengan tipe data JLabel
    JLabel tanggalLabel;
    JLabel nikLabel;
    JTextField namaText;
    //Mendeklarasikan attribut namaText dengan tipe data JTextField
    private JTextField nikText;
    private JTextField alamatText;
    private JRadioButton priaRadio;
    private JRadioButton wanitaRadio;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;

    public JTextField getNikText() {
        return nikText;
    }

    public void setNikText(JTextField nikText) {
        this.nikText = nikText;
    }
    JButton saveButton;
    //Mendeklarasikan attribut saveButton dengan tipe data JButton

    public DaftarPasienBaruDialog() {
        /**
         * Membuat method constructor kosong DaftarPasienBaruDialog
         */
        init();
        //Memanggil method init()
    }

    public DaftarPasienBaruDialog(String title) {
        /**
         * Membuat method constructor DaftarPasienBaruDialog dengan parameter
         * title dengan tipe data String
         */
        this.setTitle(title);
        //Mengisi nilai/mengeset setTitle dengan title
        init();
        //Memanggil method init()
    }

    public void init() {

        /**
         * Membuat method init dengan tipe data void, method ini berguna untuk
         * menginput nilai dari seluruh attribut
         */
        this.setLayout(null);
        //Mengisi nilai/mengeset setLayout dengan null
        judulLabel = new JLabel("Form Daftar Pasien Baru");
        //Membuat method baru judulLabel dengan tipe data JLabel dan mengisinya dengan "Form Daftar Antrian" 
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        judulLabel.setBounds(50, 20, 250, 50);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(judulLabel);
        //Menambahkan judulLabel

        namaLabel = new JLabel("Nama : ");
        //Membuat method baru Nama dengan tipe data JLabel dan mengisinya dengan "Nama : " 
        namaLabel.setBounds(20, 90, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(namaLabel);
        //Menambahkan Nama

        namaText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        namaText.setBounds(120, 90, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(namaText);
        //Menambahkan namaText

        priaRadio = new JRadioButton("Pria");
        priaRadio.setBounds(120, 120, 100, 30);
        this.add(priaRadio);

        wanitaRadio = new JRadioButton("Wanita");
        wanitaRadio.setBounds(220, 120, 100, 30);
        this.add(wanitaRadio);

        ButtonGroup ButtonKelamin = new ButtonGroup();
        ButtonKelamin.add(priaRadio);
        ButtonKelamin.add(wanitaRadio);

        tanggalLabel = new JLabel("Tanggal Lahir");
        tanggalLabel.setBounds(20, 150, 100, 30);
        this.add(tanggalLabel);

        tanggalCombo = new JComboBox();
        tanggalCombo.setBounds(120, 150, 100, 30);
        this.add(tanggalCombo);

        bulanCombo = new JComboBox();
        bulanCombo.setBounds(230, 150, 100, 30);
        this.add(bulanCombo);

        tahunCombo = new JComboBox();
        tahunCombo.setBounds(340, 150, 100, 30);
        this.add(tahunCombo);

        AlamatLabel = new JLabel("Alamat : ");
        //Membuat method baru Alamat dengan tipe data JLabel dan mengisinya dengan "Alamat : " 
        AlamatLabel.setBounds(20, 190, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(AlamatLabel);
        //Menambahkan Alamat

        alamatText = new JTextField();
        //Membuat method baru namaText dengan tipe data JTextField
        alamatText.setBounds(120, 190, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label dan jarak label terhadap tabel dialognya
        this.add(alamatText);
        //Menambahkan namaText

        nikLabel = new JLabel("NIK");
        nikLabel.setBounds(20, 230, 100, 30);
        this.add(nikLabel);

        nikText = new JTextField();
        nikText.setBounds(120, 230, 100, 30);
        this.add(nikText);

        saveButton = new JButton("SIMPAN");
        //Membuat method baru saveButton dengan tipe data JButton dan mengisinya dengan "SIMPAN"
        saveButton.setBounds(120, 350, 100, 30);
        //Menentukan/mengeset setBounds sebagai ukuran label(Tulisan) dan jarak label(Tulisan) terhadap tabel dialognya
        this.add(saveButton);
        //Menambahkan saveButton
        saveButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            try {
                baru.setNoRekamMedis(nikText.getText());
            } catch (Exception ex) {
                Logger.getLogger(DaftarPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");

            this.dispose();
        }
    }

}

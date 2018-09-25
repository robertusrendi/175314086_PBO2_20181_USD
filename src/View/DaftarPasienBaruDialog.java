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
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private JButton saveButton;
    private String ArrayTanggal[] = {"Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
        "25", "26", "27", "28", "29", "30", "31"};
    private String ArrayBulan[] = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private String ArrayTahun[] = {"Tahun", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1970", "1971", "1972", "1973", "1974", "1975",
        "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932",
        "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954",
        "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1976", "1977", "1978", "1979", "1980", "1981", "1982",
        "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
        "2005", "2005", "2006", "2007", "2008", "2009", "2010"};

    public JTextField getNikText() {
        return nikText;
    }

    public void setNikText(JTextField nikText) {
        this.nikText = nikText;
    }

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

        JComboBox tanggalCombo = new JComboBox(ArrayTanggal);
        tanggalCombo.setBounds(120, 150, 100, 30);
        this.add(tanggalCombo);

        JComboBox bulanCombo = new JComboBox(ArrayBulan);
        bulanCombo.setBounds(230, 150, 100, 30);
        this.add(bulanCombo);

        JComboBox tahunCombo = new JComboBox(ArrayTahun);
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
            Pasien PasienBaru = new Pasien();
            PasienBaru.setNama(namaText.getText());
            PasienBaru.setAlamat(alamatText.getText());
            PasienBaru.setNik(nikText.getText());
            int tanggal = Integer.valueOf(this.tanggal.getSelectedItem().toString());
            int bulan = Integer.valueOf(this.bulan.getSelectedItem().toString());
            int tahun = Integer.valueOf(this.tahun.getSelectedItem().toString());
            try {
                PasienBaru.setTanggalLahir(tanggal);
                PasienBaru.setBulanLahir(bulan);
                PasienBaru.setTahunLahir(tahun);
            } catch (Exception ex) {
                Logger.getLogger(DaftarPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pasien.tambahPasienBaru(PasienBaru);
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");

            this.dispose();
        }
    }

}

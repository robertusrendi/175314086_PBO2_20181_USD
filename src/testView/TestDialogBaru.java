/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import View.DaftarAntrianDialog;
import View.DaftarPasienBaruDialog;

/**
 *
 * @author jarkom
 */
public class TestDialogBaru {
    public static void main(String[] args) {
        DaftarPasienBaruDialog test = new DaftarPasienBaruDialog("Dialog Baru");
        test.setSize(500, 510);
        test.setVisible(true);
    }
}

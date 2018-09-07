/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import View.DaftarAntrianDialog;

/**
 *
 * @author jarkom
 */
public class TestDialog {
    public static void main(String[] args) {
        DaftarAntrianDialog test = new DaftarAntrianDialog("Latihan Dialog");
        test.setSize(300, 400);
        test.setVisible(true);
    }
}

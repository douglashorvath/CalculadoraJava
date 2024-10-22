/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package liberteti.com.calculadora;

import Frames.TelaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author dough
 */
public class Calculadora {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
	    "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }

        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
    }

}

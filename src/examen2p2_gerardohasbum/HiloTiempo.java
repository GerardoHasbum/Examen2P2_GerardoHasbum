/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_gerardohasbum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ghasb
 */
public class HiloTiempo implements Runnable{
    
    private JLabel label;
    int segundos, minutos;
    private boolean vive = true;

    public HiloTiempo(JLabel label) {
        this.label = label;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    
    
    

    @Override
    public void run() {
        
        while (vive){
            
            if (segundos < 59) {
                segundos++;
            } else if (segundos == 59) {
                segundos = 0;
                minutos++;
            }
            
            label.setText(minutos+":"+segundos);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            
        }
            
        }
        
    }
    
}

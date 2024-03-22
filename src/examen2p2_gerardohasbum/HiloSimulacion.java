/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_gerardohasbum;

import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;

/**
 *
 * @author ghasb
 */
public class HiloSimulacion implements Runnable {

    private JProgressBar jpb;
    private Carro c;
    private boolean vive = true;

    public HiloSimulacion(JProgressBar jpb, Carro c) {
        this.jpb = jpb;
        this.c = c;
    }

    public JProgressBar getJpb() {
        return jpb;
    }

    public void setJpb(JProgressBar jpb) {
        this.jpb = jpb;
    }

    public Carro getC() {
        return c;
    }

    public void setC(Carro c) {
        this.c = c;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    

    @Override
    public void run() {

        while (vive) {

            if (jpb.getValue() < jpb.getMaximum()) {

                jpb.setValue(jpb.getValue() + c.getVelocidad());

            } else {

                vive = false;

            }

            try {

                Thread.sleep(15);

            } catch (InterruptedException e) {

            }

        }

    }

}

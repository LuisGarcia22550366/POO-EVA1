package eva_4_tv;

import javax.swing.JOptionPane;

public class Tv {

    private int volume;
    private int channel;
    private boolean turn_on_off;

    public Tv() {
        volume = 0;
        channel = 0;
        turn_on_off = false;
    }

    public void TurnOnOff() {
        if (turn_on_off = true) {
            turn_on_off = false;
            System.out.println("Apagando pantalla");

        } else 
            turn_on_off = true;
            System.out.println("Encendiendo pantalla");
        

    }

    public void VolumePlus() {
        if (turn_on_off == true) {
            if (volume < 100) 
                volume++;
                System.out.println("Volumen: " + volume);
            
        }
    }

    public void VolumeLess() {
        if (turn_on_off == true) {
            if (volume > 0) 
                volume--;
                System.out.println("Volumen: " + volume);
            
        }
    }

    public void ChannelPlus() {
        if (turn_on_off == true) {
            channel++;
            if (channel > 100) 
                channel = 0;
                
                System.out.println("Canal: " + channel);
            
        }

    }

    public void ChannelLess() {
        if (turn_on_off == true) {
            channel--;
            if (channel < 0) 
                channel = 100;
                System.out.println("Canal: " + channel);
            
        }

    }

}

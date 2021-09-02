/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author Rafael Gorayb
 */
public class Splash {
    
    private final int LARGURA_IMG = 480;
    private final int ALTURA_IMG = 270;
    private final int TEMPO_DE_SPLASH = 1500;
    private final String CAMINHO_GIF = "/SplashScreen/telaCarregamento.gif";
    
    public Splash(){
        
        JWindow janelaSplash = new JWindow();
        
        janelaSplash.getContentPane().add(
                new JLabel(
                        "",
                        new ImageIcon(getClass().getResource(CAMINHO_GIF)),
                        SwingConstants.CENTER
                )
        );
              
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        
        janelaSplash.setBounds(
                (dimension.width - LARGURA_IMG) / 2,
                (dimension.height - ALTURA_IMG)/ 2,
                LARGURA_IMG,
                ALTURA_IMG
        );
        
        janelaSplash.setVisible(true);
        
        try{
            Thread.sleep(TEMPO_DE_SPLASH);
        }catch(InterruptedException e){}
        
        janelaSplash.dispose();
        
    }
    
}

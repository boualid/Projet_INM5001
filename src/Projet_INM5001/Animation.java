/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author bwali
 */
public class Animation extends  javax.swing.JFrame{
    
    
    private void animation(Graphics g){
         int i = 0;
        BufferedImage Logo = LoadImage("Logo.png");
        AffineTransform at = AffineTransform.getTranslateInstance(100, 100);
        at.rotate(Math.toRadians(i++));
        repaint();
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Logo, at, this);
       
    }
    BufferedImage LoadImage(String FileName){
        BufferedImage img = null;
        try{
        img = ImageIO.read(new File(FileName));
        }catch(IOException e){
            
        }
        return img;
        
    }
}

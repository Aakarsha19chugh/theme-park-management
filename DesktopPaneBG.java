


import java.awt.Graphics;
import java.io.File;
import javax.swing.*;
import javax.swing.JDesktopPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author umesh
 */
public class DesktopPaneBG extends JDesktopPane {

    private ImageIcon img;
    private String backgroundImage="372198.jpg";

    public DesktopPaneBG() {
        this.img = new ImageIcon(backgroundImage);
        File f=new File(backgroundImage);
        System.out.print(f.getAbsolutePath()+","+f.exists());
    }

    @Override
    protected void paintComponent(Graphics grphcs) {

        super.paintComponent(grphcs);
      
        grphcs.drawImage(img.getImage(), 0, 0, null);
    }

}

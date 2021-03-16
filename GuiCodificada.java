/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicodificada;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SANTIAGO CUERVO
 */
public class GuiCodificada  extends JFrame implements  ActionListener{
    JPanel p1;
    JTextField t1;
    JButton b1;
    JLabel l1;
    JColorChooser j1;
    //Constructor
    public GuiCodificada(){
        
        //declaro; instancio, agrego

        //         x    y  ancho alto
        setBounds(300, 200, 500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1 = new JPanel();
        p1.setBackground(Color.CYAN);
        p1.setLayout(new FlowLayout());
        t1 = new JTextField(10);
        b1 = new JButton("Botonsito");
        l1 = new JLabel("Digite algo");
        j1 = new JColorChooser();   
        //Escuchar el elemento
        b1.addActionListener(this);    
        add(p1);
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(j1);
        setVisible(true);
        
    }

  
    public static void main(String[] args) {
        // TODO code application logic here
        GuiCodificada miInterfaz = new GuiCodificada();
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento,datoCaja1;
        evento = b1.getActionCommand();
        if(evento.equals("Botonsito"))
        {
            datoCaja1 =t1.getText();
            JOptionPane.showMessageDialog(this, "El texto es: " + datoCaja1);
            //t1.setText("si sirve");
        }
        
    }
    
}

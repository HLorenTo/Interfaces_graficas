package mision_tic_2022_interfaces_graficas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class mision_tic_2022_interfaces_graficas extends JFrame{
    public mision_tic_2022_interfaces_graficas(){//contructor
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setLayout(null);
        JLabel label1=new JLabel("Hola tripulantes del grupo 68");
        label1.setBounds(5, 300, 200, 15);
        panel1.add(label1);
        
        JLabel label2=new JLabel("¿Cómo están?");
        panel1.add(label2);
        label2.setBounds(250, 50, 100, 15);
        
        JTextField campo1 = new JTextField();
        campo1.setBounds(250, 150, 200, 15);
        panel1.add(campo1);
        
        JLabel documento = new JLabel("DOCUMENTO");
        documento.setBounds(160, 150, 100, 15);
        panel1.add(documento);
        
        JTextField user = new JTextField("Username - email");
        user.setBounds(250, 180, 200, 15);
        panel1.add(user);
        
        JTextField pass = new JTextField("Password");
        pass.setBounds(250, 200, 200, 15);
        panel1.add(pass);
        
        JLabel crear = new JLabel("Not yet resistred?");
        crear.setBounds(470, 180, 200, 15);
        panel1.add(crear);
        
        JLabel agente = new JLabel("I am an agent");
        agente.setBounds(470, 200, 100, 15);
        panel1.add(agente);
        
        JButton boton = new JButton("Cerrar app");
        boton.setBounds(240, 250, 200, 40);
        panel1.add(boton);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Presiono el botón");
        }
        }
        );
        
        //add(panel1); //añadir panela a la ventana
        //------------------------------------------
        //cambiar el titulo mediante un campo de texto y un boton directamente en la ventana principal
        setLayout(null);
        JLabel titulonew = new JLabel("Nuevo Titulo");
        titulonew.setBounds(9, 5, 150, 20);
        add(titulonew);
        
        JTextField camptxt = new JTextField("Ingrese Título");
        camptxt.setBounds(118, 8, 190, 20);
        add(camptxt);
        
        JButton botoncambiar = new JButton("Cambiar Título");
        botoncambiar.setBounds(15, 85, 250, 30);
        add(botoncambiar);
        
        botoncambiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==botoncambiar){
                    String titulo = camptxt.getText();
                    setTitle(titulo);
                }
        }
        }
        );
        
    }
    public static void main(String[] args) {
        mision_tic_2022_interfaces_graficas ventana = new mision_tic_2022_interfaces_graficas();
        ventana.setBounds(5, 10, 600, 400);
        //ventana.setLayout(null);//desactivar el diseño default Jframe
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Hola_Mundo");//agregar titulo
        ventana.setLocationRelativeTo(null);
    }   
}
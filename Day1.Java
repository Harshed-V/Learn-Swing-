import javax.swing.*;
import java.awt.*;
public class DAy1Window {
    public static void main(String[] args) {
        //Create a frame(window)
        JFrame frame = new JFrame("My first Swing App");
        frame.setIconImage(new ImageIcon("eyebrow-cat.png").getImage());
        //Create a Label
        JLabel label = new JLabel("Welcome to Swing!");
        label.setBounds(100,50,200,30); // x,y,width,height
        label.setFont(new Font("Dialog", Font.BOLD, 16));
        //create a Button
        JButton button = new JButton("Click me!");
        button.setBounds(100,100,120,30);
        button.setBackground(new Color(66, 135, 245));
        button.setForeground(Color.WHITE);
        button.addActionListener(e->label.setText("Meow you Clicked me !"));
        //Add component to the frame
        frame.add(label);
        frame.add(button);
        //frame.setLocationRelativeTo(null);

        //set frame size and layout
        frame.setSize(350,250); //width,height
        frame.setLayout(null); //Allows absolute positioning
        frame.setVisible(true); //show the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

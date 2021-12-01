import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class mainFrame{
  private static final int frameWidth = 600;
  private static final int frameHeight = 110;

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel names = new JLabel();
    JLabel blank = new JLabel();
    blank.setText("  ");
    names.setText("by: Jun Lee, Luz Acevedo, Sean Paxton, and Alex Elguezabal");
    names.setVerticalAlignment(JLabel.BOTTOM);
    names.setHorizontalAlignment(JLabel.CENTER);

    //
    // panel.add(blank);

    JButton button1 = new JButton("Button 1");
    button1.setBounds(0, 0, 100, 50);
    panel.add(button1);
    // panel.add(names);
    // frame.add(panel);
    JButton button2 = new JButton("Button 2");
    button2.setBounds(40, 200, 50, 50);
    panel.add(button2);
    JButton button3 = new JButton("Button 3");
    button3.setBounds(40, 300, 50, 50);
    panel.add(button3);
    JButton button4 = new JButton("Button 4");
    button4.setBounds(40, 400, 50, 50);
    panel.add(button4);
    JButton button5 = new JButton("Button 5");
    button5.setBounds(40, 500, 50, 50);
    panel.add(button5);


    // names.setText("by: Jun Lee, Luz Acevedo, Sean Paxton, and Alex Elguezabal");
    // names.setVerticalAlignment(JLabel.TOP);
    // names.setHorizontalAlignment(JLabel.CENTER);
    //
    //

    panel.add(blank);
    panel.add(names);

    frame.add(panel);

    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(frameWidth, frameHeight);
    frame.setResizable(false);
    frame.setTitle("Red-Nosed Christmas Wizards");
    frame.setVisible(true);

  }



}//end of mainFrame

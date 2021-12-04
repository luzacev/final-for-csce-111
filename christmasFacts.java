import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class christmasFacts extends JFrame implements ChangeListener {
   private JSpinner randNum;
   private JTextField randFactField;
   private JLabel randNumLabel;
   private JLabel randFactLabel;

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   christmasFacts() {
      int initNum;     // Spinner initial value display
      int minNum;      // Spinner min value
      int maxNum;      // Spinner max value
      int stepVal;      // Spinner step

      initNum = 0;
      minNum= 0;
      maxNum = 30;
      stepVal = 1;

      //makes the grid layout
      GridBagConstraints layoutConst = null;


      SpinnerNumberModel spinnerModel = null;

      // Set frame's title
      setTitle("Random Christmas Fact Generator");

      // Create labels
      randNumLabel = new JLabel("Select a random number between 1-10:");
      randFactLabel = new JLabel("Christmas Fact:");

      // Create a spinner model, the spinner, and set the change listener
      spinnerModel = new SpinnerNumberModel(initNum, minNum, maxNum, stepVal);
      randNum = new JSpinner(spinnerModel);
      randNum.addChangeListener(this);

      // Create field
      randFactField = new JTextField(45);
      randFactField.setEditable(false);
      randFactField.setText("Ho Ho Ho");


      setLayout(new GridBagLayout());


      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(randNumLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(randNum, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 1);
      layoutConst.anchor = GridBagConstraints.LINE_END;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(randFactLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 1, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(randFactField, layoutConst);
   }

   @Override
   public void stateChanged(ChangeEvent event) {
      Integer pickNum;

      pickNum = (Integer) randNum.getValue();

//The cases for each number when selected by the user.
      switch (pickNum) {
         case 0:
            randFactField.setText("Ho Ho Ho");
            break;

         case 1:
            randFactField.setText("Christmas trees were first used by ancient Egyptians and Romans.");
            break;

         case 2:
            randFactField.setText("Jingle Bells was the first song played in space.");
            break;

         case 3:
            randFactField.setText("There is a Christmas tree in Spain worth $15 million.");
            break;

         case 4:
            randFactField.setText("The first Christmas card ever sent is worth almost $30,000.");
            break;

         case 5:
            randFactField.setText("There are nearly 750 different versions of Silent Night.");
            break;

         case 6:
            randFactField.setText("People in Japan eat KFC on Christmas.");
            break;

         case 7:
            randFactField.setText("A handwritten copy of 'Twas the Night Before Christmas was sold for $280,000.");
            break;

         case 8:
            randFactField.setText("Christmas came from the words Cristes Maesse meaning 'mass of christ'");
            break;

         case 9:
            randFactField.setText("In Ukraine, spiders are considered symbols of good luck at Christmas");
            break;

         case 10:
            randFactField.setText("The Statue of Liberty is the largest Christmas gift ever given.");
            break;

         default:
            randFactField.setText("Not following directions, Santas watching you know!");
      }
   }//end stateChanged main


   public static void main(String[] args) {

      christmasFacts myFrame = new christmasFacts();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
      myFrame.setLocationRelativeTo(null);
   }//end main
}//end class

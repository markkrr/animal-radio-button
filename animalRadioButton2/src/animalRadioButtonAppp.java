import javax.swing.*; // Importing Swing library for GUI components
import java.awt.*; // Importing AWT library for layout managers and other AWT components
import java.awt.event.*; // Importing AWT library for event handling

class AnimalRadioButtonApp extends JFrame {

    private JLabel imageLabel; // Label to display selected car image

    public AnimalRadioButtonApp() {
        setTitle("Animal Radio Button Application"); // Setting the title of the window
        setSize(600, 500); // Setting the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define the close operation
        setLocationRelativeTo(null); // Centering the window on the screen

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Arranges components in a left-to-right flow
        JLabel label = new JLabel("CHOOSE An animal:"); // Label for instructions
        panel.add(label); // Adding label to the panel

        // Creating radio buttons for car choices
        JRadioButton cowButton = new JRadioButton("cow");
        JRadioButton pigButton = new JRadioButton("pig");
        JRadioButton goatButton = new JRadioButton("goat");
        JRadioButton sheepButton = new JRadioButton("sheep");

        // Grouping radio buttons to ensure only one is selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(cowButton);
        group.add(pigButton);
        group.add(goatButton);
        group.add(sheepButton);

        // Adding radio buttons to the panel
        panel.add(cowButton);
        panel.add(pigButton);
        panel.add(goatButton);
        panel.add(sheepButton);



        JLabel resultLabel = new JLabel("Selected car will be displayed here."); // Label to display the selected car
        panel.add(resultLabel); // Adding label to the panel

        imageLabel = new JLabel(); // Label to display the selected car image
        panel.add(imageLabel); // Adding image label to the panel

        // Adding action listeners to radio buttons to update resultLabel and imageLabel
        cowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected: cow");
                ImageIcon icon = new ImageIcon(getClass().getResource("/cow.jpg"));
                imageLabel.setIcon(icon); // Set the icon to the label
            }
        });

        pigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected: pig");
                ImageIcon icon = new ImageIcon(getClass().getResource("/pig.jpg"));
                imageLabel.setIcon(icon); // Set the icon to the label
            }
        });

        goatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected: goat");
                ImageIcon icon = new ImageIcon(getClass().getResource("/goat.jpeg"));
                imageLabel.setIcon(icon); // Set the icon to the label
            }
        });

        sheepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected: sheep");
                ImageIcon icon = new ImageIcon(getClass().getResource("/sheep.jpg"));
                imageLabel.setIcon(icon); // Set the icon to the label
            }
        });

        add(panel); // Adding the panel to the frame
        setVisible(true); // Making the frame visible
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Ensuring GUI creation on the Event Dispatch Thread
            @Override
            public void run() {
                new AnimalRadioButtonApp(); // Creating an instance of the application
            }
        });
    }
}

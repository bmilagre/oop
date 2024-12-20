package ch.hslu.exercise.sw13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MotorView extends JFrame {
    private static final Logger LOG = LoggerFactory.getLogger(MotorView.class);

    private final JLabel labelState = new JLabel("The switch is OFF.");
    private final JButton buttonOn = new JButton("On");
    private final JButton buttonOff = new JButton("Off");

    public MotorView(){
        super("Motor View");

        this.labelState.setHorizontalAlignment(JLabel.CENTER);
        this.labelState.setOpaque(true);

        this.setLayout(new BorderLayout());
        this.add(buttonOn, BorderLayout.NORTH);
        this.add(labelState, BorderLayout.CENTER);
        this.add(buttonOff, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        LOG.info("GUI-Frame aktiviert und sichtbar.");
    }

    /**
     * The listener will be the event when the button is pressed
     * @param listener
     */
    public void addButtonActionListener(ActionListener listener) {
        buttonOn.addActionListener(listener);
        buttonOff.addActionListener(listener);
    }

    public JButton getButtonOn() {
        return buttonOn;
    }

    public JButton getButtonOff() {
        return buttonOff;
    }

    public void updateState(MotorState state) {
        if (state == MotorState.ON) {
            labelState.setText("The switch is ON.");
            labelState.setBackground(Color.GREEN);
        } else if (state == MotorState.OFF) {
            labelState.setText("The switch is OFF.");
            labelState.setBackground(Color.RED);
        }
    }
}

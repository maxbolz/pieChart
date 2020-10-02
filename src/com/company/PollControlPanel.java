/*
 * Implements the control panel for the Poll program
 */
package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PollControlPanel extends JPanel
        implements ActionListener
{
    private JButton button1, button2, button3;
    private PollDisplayPanel chartPanel;

    public PollControlPanel(PollDisplayPanel chart)
    {
        chartPanel = chart;

        button1 = new JButton("Trump");
        button1.setPreferredSize(new Dimension(80, 30));
        button1.setToolTipText("Vote for Trump");
        button1.addActionListener(this);

        button2 = new JButton("Biden");
        button2.setPreferredSize(new Dimension(80, 30));
        button2.setToolTipText("Vote for Biden");
        button2.addActionListener(this);

        button3 = new JButton("Bolz");
        button3.setPreferredSize(new Dimension(80, 30));
        button3.setToolTipText("Vote for Bolz");
        button3.addActionListener(this);

        add(button1);
        add(button2);
        add(button3);
    }

    /**
     *  Processes button events
     */
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton)e.getSource();

        if (button == button1)
            chartPanel.vote1();
        else if (button == button2)
            chartPanel.vote2();
        else if (button == button3)
            chartPanel.vote3();
        chartPanel.repaint();
    }

}
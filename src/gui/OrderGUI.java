package gui;
import domain.MenuList;
import domain.OrderList;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class OrderGUI extends JFrame implements ActionListener{

    JScrollPane scrollList;
    JButton showListByNumber, showListByScore, showListByName, close;
    JTextArea displayList;

    private MenuList items;
    private OrderList orders;

    public OrderGUI(MenuList items, OrderList orders) {
        this.items = items;
        this.orders = orders;
        this.initGUI();

    }

    /**
     * Initialize GUI
     */
    public void initGUI() {
        setTitle("OrderGUI");

        setupNorthPanel();
        setupSouthPanel();

        pack();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 600);
        setVisible(true);
    }

    private void setupNorthPanel() {
        JPanel northPanel = new JPanel();

        showListByNumber = new JButton("List By x");
        showListByNumber.addActionListener(this);

        showListByName = new JButton("List By y");
        showListByName.addActionListener(this);

        showListByScore= new JButton("List By a");
        showListByScore.addActionListener(this);

        close = new JButton("Close");
        close.addActionListener(this);

        northPanel.add(showListByNumber);
        northPanel.add(showListByName);
        northPanel.add(showListByScore);
        northPanel.add(close);
        this.add(northPanel, BorderLayout.NORTH);
    }


    private void setupSouthPanel() {
        displayList = new JTextArea(15,20);
        displayList.setFont(new Font (Font.MONOSPACED, Font.PLAIN,14));
        displayList.setEditable(false);
        scrollList = new JScrollPane(displayList);
        this.add(scrollList,BorderLayout.CENTER);
    }

    public void startOrders(){}

    // add to orders list
    public void completeOrders(){}

    //display bill in gui
    public void displayBill(){}

    public void applyDiscount(){}

    public void addToBill(){}

    public void removeFromBill(){}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.showListByNumber) {
            displayList.setText("xxx");
        }
        else if (e.getSource() == this.showListByName ) {
            displayList.setText("yyy");
        }
        else if(e.getSource() == this.showListByScore) {
            displayList.setText("aaa");
        }
        else if (e.getSource() == this.close) {
            JOptionPane.showMessageDialog(this, "Are you sure you want to close?");
            System.exit(0);
        }
    }
}






































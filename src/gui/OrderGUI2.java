package gui;
import domain.MenuList;
import domain.OrderList;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class OrderGUI2 extends JFrame implements ActionListener{
    private MenuList items;
    private OrderList orders;

    public OrderGUI2(MenuList items, OrderList orders) {
        this.items = items;
        this.orders = orders;
        this.initGUI();

    }

    /**
     * Initialize GUI
     */
    public void initGUI() {
        setTitle("Coffee Menu");

        setupNorthPanel();
        setupCenterPanel();

        pack();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1024, 800);
        setVisible(true);
    }

    private void setupNorthPanel() {
        JPanel northPanel = new JPanel(new BorderLayout());
        JLabel title = new JLabel("Bar");
        northPanel.add(title, BorderLayout.WEST);
        this.add(northPanel, BorderLayout.NORTH);
    }

    private JPanel createMenuPanel(){
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());
        menuPanel.setBackground(Color.RED);

        JButton showHotDrinks = new JButton("Hot Drinks");
        showHotDrinks.addActionListener(this);
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.BOTH;
        c1.gridwidth = 1;
        c1.weightx = 1;
        c1.weighty = 1;
        c1.gridx = 0;
        c1.gridy = 0;
        c1.insets = new Insets(70,70,70,70);
        menuPanel.add(showHotDrinks, c1);

        JButton showColdDrinks= new JButton("Cold Drinks");
        showColdDrinks.addActionListener(this);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.BOTH;
        c2.gridwidth = 1;
        c2.weightx = 1;
        c2.weighty = 1;
        c2.gridx = 1;
        c2.gridy = 0;
        c2.insets = new Insets(70,70,70,70);
        menuPanel.add(showColdDrinks, c2);

        JButton showMeal= new JButton("Meal");
        showMeal.addActionListener(this);
        GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.BOTH;
        c3.gridwidth = 1;
        c3.weightx = 1;
        c3.weighty = 1;
        c3.gridx = 0;
        c3.gridy = 1;
        c3.insets = new Insets(30,30,30,30);
        menuPanel.add(showMeal, c3);

        JButton showDessert = new JButton("Dessert");
        showDessert.addActionListener(this);
        GridBagConstraints c4 = new GridBagConstraints();
        c4.fill = GridBagConstraints.BOTH;
        c4.gridwidth = 1;
        c4.weightx = 1;
        c4.weighty = 1;
        c4.gridx = 1;
        c4.gridy = 1;
        c4.insets = new Insets(30,30,30,30);
        menuPanel.add(showDessert, c4);

        JButton showOffer1 = new JButton("Offer 1");
        showOffer1.addActionListener(this);
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.BOTH;
        c1.gridwidth = 1;
        c1.weightx = 1;
        c1.weighty = 2;
        c1.gridx = 0;
        c1.gridy = 0;
        menuPanel.add(showOffer1, c1);

        JButton showOffer2 = new JButton("Offer 2");
        showOffer2.addActionListener(this);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.BOTH;
        c2.gridwidth = 1;
        c2.weightx = 1;
        c2.weighty = 1;
        c2.gridx = 1;
        c2.gridy = 0;
//        southPanel.add(showOffer2, c2);

        JButton showOffer3= new JButton("Offer 3");
        showOffer3.addActionListener(this);
        GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.BOTH;
        c3.gridwidth = 1;
        c3.weightx = 1;
        c3.weighty = 1;
        c3.gridx = 2;
        c3.gridy = 0;
//        southPanel.add(showOffer3, c3);

        return menuPanel;
    }

    private JPanel createBasketPanel(){
        JPanel basketPanel = new JPanel();
        basketPanel.setLayout(new GridBagLayout());
        basketPanel.setBackground(Color.WHITE);

        return basketPanel;
    }

    private void setupCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.BLACK);

        JPanel menuPanel = this.createMenuPanel();
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.BOTH;
        c1.gridwidth = 1;
        c1.weightx = 4;
        c1.weighty = 1;
        c1.gridx = 0;
        c1.gridy = 0;
        centerPanel.add(menuPanel, c1);

        JPanel basketPanel = this.createBasketPanel();
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.BOTH;
        c2.gridwidth = 1;
        c2.weightx = 6;
        c2.weighty = 1;
        c2.gridx = 1;
        c2.gridy = 0;
        centerPanel.add(basketPanel, c2);

        this.add(centerPanel, BorderLayout.CENTER);
    }

    public void startOrders(){}

    public void completeOrders(){}

    public void displayBill(){}

    public void applyDiscount(){}

    public void addToBill(){}

    public void removeFromBill(){}

    public void actionPerformed(ActionEvent e) {

    }
}






































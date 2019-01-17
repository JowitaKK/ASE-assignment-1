import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderGUI extends JFrame implements ActionListener {
    private MenuList items;
    private OrderList orders;

    public OrderGUI(MenuList items, OrderList orders) {
        this.items = items;
        this.orders = orders;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void startOrders(){}

    // add to orders list
    public void completeOrders(){}

    //display bill in gui
    public void displayBill(){}

    public void applyDiscount(){}

    public void addToBill(){}

    public void removeFromBill(){}
}

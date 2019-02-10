import domain.MenuList;
import domain.OrderList;
import domain.ShopManager;
import gui.OrderGUI;
import gui.OrderGUI2;

public class Main {

    public static void main(String[] args){
        MenuList menuList = MenuList.fromFile("menuItems.csv");
        System.out.println(menuList);

        OrderList orderList = OrderList.fromFile("customerOrders.csv");
        System.out.println(orderList);


        ShopManager manager = new ShopManager(menuList, orderList);
//        OrderGUI orderGUI = new OrderGUI(menuList, orderList);
        OrderGUI2 orderGUI2 = new OrderGUI2(menuList, orderList);

        manager.generateReport();

    }
}

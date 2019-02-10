package gui;

import domain.ItemCategory;
import domain.MenuList;

import javax.swing.*;

public class MenuItemsPanel extends JPanel {
    ItemCategory category;
    MenuList list;

    public MenuItemsPanel(ItemCategory category, MenuList list){
        this.category = category;
        this.list = list;
    }
}

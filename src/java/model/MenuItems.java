/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoeGollakner
 */
public class MenuItems {
    
    
    public List getItems(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Steak")) {
            items.add(17.50);

        } else if (menuItems.equals("Chicken")) {
            items.add(6.50);

        } else if (menuItems.equals("Beef")) {
            items.add(8.99);

        } else {
            items.add(7.95);
        }

        return items;
    }
    public List getItems2(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Alfredo")) {
            items.add(11.25);

        } else if (menuItems.equals("Spaghetti")) {
            items.add(9.75);

        } else if (menuItems.equals("MashedPotatoes")) {
            items.add(5.99);

        } else {
            items.add(4.50);
        }

        return items;
    }
    
    public List getItems3(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Beer")) {
            items.add(3.00);

        } else if (menuItems.equals("Wine")) {
            items.add(9.75);

        } else if (menuItems.equals("Whiskey")) {
            items.add(5.99);

        } else {
            items.add(4.50);
        }

        return items;
    }
    
    public List getItems4(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Cake")) {
            items.add(3.25);

        } else if (menuItems.equals("Pie")) {
            items.add(4.99);

        } else if (menuItems.equals("IceCream")) {
            items.add(2.25);

        } else {
            items.add(3.25);
        }

        return items;
    }
    
    
}

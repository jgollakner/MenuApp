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
            items.add("New York Strip");

        } else if (menuItems.equals("Chicken")) {
            items.add("Roasted Chicken Breast");

        } else if (menuItems.equals("Beef")) {
            items.add("Double Cheeseburger");

        } else {
            items.add("Pork Chops");
        }

        return items;
    }
    public List getItems2(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Alfredo")) {
            items.add("Pasta Alfredo");

        } else if (menuItems.equals("Spaghetti")) {
            items.add("Italian Spaghetti");

        } else if (menuItems.equals("MashedPotatoes")) {
            items.add("Garlic Mashed Potatoes");

        } else {
            items.add("Brown Rice");
        }

        return items;
    }
    
    public List getItems3(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Beer")) {
            items.add("Miller Lite");

        } else if (menuItems.equals("Wine")) {
            items.add("Cabernet");

        } else if (menuItems.equals("Whiskey")) {
            items.add("Old Thompson Whiskey");

        } else {
            items.add("Bombay Gin");
        }

        return items;
    }
    
    public List getItems4(String menuItems) {
        List items = new ArrayList();

        if (menuItems.equals("Cake")) {
            items.add("Red Velvet Cake");

        } else if (menuItems.equals("Pie")) {
            items.add("French Silk Pie");

        } else if (menuItems.equals("IceCream")) {
            items.add("Vanilla Ice Cream");

        } else {
            items.add("Fudge Brownie");
        }

        return items;
    }
    
    
}

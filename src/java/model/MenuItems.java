/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author JoeGollakner
 */
public class MenuItems {

    public String getItems(String menuItems) {
       // List items = new ArrayList();
        String theMeat;
        double mPrice;

        if (menuItems.equals("Steak")) {
            theMeat = "New York Strip";
            mPrice = 19.99;

        } else if (menuItems.equals("Chicken")) {
            theMeat = "Roasted Chicken Breast";
            mPrice = 19.99;

        } else if (menuItems.equals("Beef")) {
            theMeat = "Double Cheeseburger";
            mPrice = 19.99;

        } else if (menuItems.equals("Pork")) {
            theMeat = "Pork Chops";
            mPrice = 19.99;
            
        } else {
            theMeat = "";
            mPrice = 0;
        }

        return theMeat;


    
    }

    public String getItems2(String menuItems) {
        //List items2 = new ArrayList();
        
        String thePasta;

        if (menuItems.equals("Alfredo")) {
            thePasta = "Pasta Alfredo";

        } else if (menuItems.equals("Spaghetti")) {
            thePasta = "Italian Spaghetti";

        } else if (menuItems.equals("MashedPotatoes")) {
            thePasta = "Garlic Mashed Potatoes";

        } else if (menuItems.equals("Rice")) {
            thePasta = "Brown rice";

        } else {
            
            thePasta = "";
        }

        return thePasta;
    }

    public String getItems3(String menuItems) {
        //List items3 = new ArrayList();
        
        String theDrink;

        if (menuItems.equals("Beer")) {
            theDrink = "Miller Lite";

        } else if (menuItems.equals("Wine")) {
            theDrink = "Cabernet";

        } else if (menuItems.equals("Whiskey")) {
            theDrink = "Old Thompson Whiskey";

        } else if (menuItems.equals("Gin")) {
            theDrink = "Bombay gin";
        
        }else{
            theDrink = "";
        }

        return theDrink;
    }

    public String getItems4(String menuItems) {
        //List items4 = new ArrayList();
        
        String theDessert;

        if (menuItems.equals("Cake")) {
            theDessert = "Red Velvet Cake";

        } else if (menuItems.equals("Pie")) {
           theDessert = "French Silk Pie";

        } else if (menuItems.equals("IceCream")) {
            theDessert = "Vanilla Ice Cream";

        } else if (menuItems.equals("Brownie")) {
            theDessert = "Fudge Brownie";
        }else{
            theDessert = "";
        }

        return theDessert;
    }
}

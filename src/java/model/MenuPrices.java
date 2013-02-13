/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JoeGollakner
 */
public class MenuPrices {

    public String getPrice(String menuPrices) {
        String mPrice;

        if (menuPrices.equals("Steak")) {
            mPrice = "19.99";

        } else if (menuPrices.equals("Chicken")) {
            mPrice = "8.99";

        } else if (menuPrices.equals("Burger")) {
            mPrice = "7.95";

        } else if (menuPrices.equals("Pork")) {
            mPrice = "6.75";

        } else {
            mPrice = "0";
        }

        return mPrice;



    }

    public String getPrice2(String menuPrices) {

        String pPrice;

        if (menuPrices.equals("Alfredo")) {
            pPrice = "11.99";
        } else if (menuPrices.equals("Spaghetti")) {
            pPrice = "8.99";

        } else if (menuPrices.equals("MashedPotatoes")) {
            pPrice = "5.99";

        } else if (menuPrices.equals("Rice")) {
            pPrice = "3.99";

        } else {
            pPrice = "0";
        }

        return pPrice;
    }

    public String getPrice3(String menuPrices) {

        String dPrice;

        if (menuPrices.equals("Beer")) {
            dPrice = "1.50";

        } else if (menuPrices.equals("Wine")) {
            dPrice = "12.50";

        } else if (menuPrices.equals("Whiskey")) {
            dPrice = "6.50";

        } else if (menuPrices.equals("Gin")) {
            dPrice = "4.50";

        } else {
            dPrice = "0";
        }

        return dPrice;
    }

    public String getPrice4(String menuPrices) {

        String desPrice;

        if (menuPrices.equals("Cake")) {
            desPrice = "3.99";

        } else if (menuPrices.equals("Pie")) {
            desPrice = "4.25";

        } else if (menuPrices.equals("IceCream")) {
            desPrice = "2.50";

        } else if (menuPrices.equals("Brownie")) {
            desPrice = "5.50";
        } else {
            desPrice = "0";
        }

        return desPrice;
    }
}

//Картышов Владимир Антонович 11-501 1 вариант

import models.ChainElementClass;

public class Main {
    public static void main(String[] args) {
        ChainElementClass[] fruits = {new ChainElementClass("orange"), new ChainElementClass("banana"), new ChainElementClass("apple"), new ChainElementClass("pineapple"), new ChainElementClass("pear")};
        for (int i = 0; i < fruits.length; i++) {
            if (i < fruits.length - 1) {
                fruits[i].setNext(fruits[i+1]);
            }
            if (i > 0) {
                fruits[i].setPrevious(fruits[i-1]);
            }
        }
        int maxLength = 0;
        ChainElementClass current = fruits[0];
        ChainElementClass lastEl = current;
        while (current.getNext() != null) {
            if (current.getValue().length() > maxLength) {
                maxLength = current.getValue().length();
            }
            current = (ChainElementClass) current.getNext();
            lastEl = current;

        }
        System.out.println("Гистограмма");
        System.out.println("========================");
        for (int stroka = maxLength; stroka > 0; stroka--) {
            current = lastEl;

            while (current != null) {
                if (current.getValue().length() >= stroka) {
                    System.out.print(" ||| ");
                } else {
                    System.out.print("     ");
                }
                current = (ChainElementClass) current.getPrevious();
            }
            System.out.println();


        }
        current = lastEl;
        while (current != null) {
            if (current.getValue().length() >= 3) {
                System.out.print(" " + current.getValue().charAt(0) + current.getValue().charAt(1) + current.getValue().charAt(2) + " ");
            }
            else {
                System.out.print("  " + current.getValue().charAt(0) + "  ");

            }
            current = (ChainElementClass) current.getPrevious();
        }
        System.out.println("\n========================");
        System.out.println("Максимальная длина слова: " + maxLength);
    }
}

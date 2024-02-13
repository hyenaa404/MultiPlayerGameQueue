/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import util.InputUtils;

/**
 *
 * @author Admin
 */
public class Menu {
    public static int chooseInputOption(){
        System.out.println("Enter an option: ");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. Remove task");
            System.out.println("4. Print random task");
            System.out.println("5. Clear todo list");
            System.out.println("6. Exit");
        int option = InputUtils.inputOption(1, 6);
        return option;
    }
}

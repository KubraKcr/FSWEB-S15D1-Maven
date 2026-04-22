package org.example.models;

import java.util.*;

public class Grocery {


    public static List <String> groceryList = new ArrayList<>();

    public void startGrocery(){
        Scanner scanner = new Scanner(System.in);



        while (true){
             System.out.println(("Lütfen bir değer giriniz"));
             int input = scanner.nextInt();
            scanner.nextLine();
             switch (input) {
                 case 1:
                     System.out.println(("Eklenmesini istediğiniz elemanları giriniz."));

                  break;

                 case 2 :
                     System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");



                     break;

                 case 0 :
                     System.out.println("Programdan çıkılıyor");
                     break;
             }

            }
        }


        public static void addItems(String input){

        if(input== null){
            System.out.println("input değeri boş");
            return;
        }
            String [] inputArr= input.split(",");

               for (String value : inputArr) {
                 if(!checkItemIsInList(value.trim())){
                     groceryList.add(value.trim());
                 }

               }

    groceryList.sort(String::compareTo);
    }



    public static boolean checkItemIsInList(String product) {
        if (product == null) return false;
        return groceryList.contains(product.trim());
    }


    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

    public static void removeItems(String input){
        String[] removeArr = input.split(",");


        for (String removing : removeArr) {
          if(checkItemIsInList(removing.trim())){
              groceryList.remove(removing);
          }
        }
 groceryList.sort(String::compareTo);
    }}






package org.example;

public class Cheke {
    public App app = new App();

    public static void main(String[] args){
        String query = "select Demo, java from Sheet1 where column = Hello";

        String[] aplitter  = query.split(" ");
        if(aplitter[1].equals("*")){
            System.out.println("Print All");

        }else {
            String columns = aplitter[1];
            if(aplitter[2].trim().toLowerCase().equals(",")){
                aplitter[1]=aplitter[1] + aplitter[3];
            }
        }



    }
}


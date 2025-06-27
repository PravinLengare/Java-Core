package Collection_Framework;

import java.io.File;
import java.io.FileWriter;
import java.io.IO;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        // Creating a file

//        File myfile = new File("pravin.txt");
//        try{
//            myfile.createNewFile();
//        }
//        catch (IOException e){
//            System.out.println("Unable  to create file");
//            e.printStackTrace();
//           System.out.println(e);
//        }

        //      Writing  in a file by java

//        try {
//            FileWriter fileWriter = new FileWriter("pravin.txt");
//            fileWriter.write("I am creating a first file by using a java \n I am Pravin ");
//            fileWriter.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//
//        }

        // Reading a file by java


//        File file = new File("pravin.txt");
//        try{
//            Scanner s =  new Scanner(file);
//            while(s.hasNextLine()){
//                String line  = s.nextLine();
//                System.out.println(line);
//            }
//            s.close();
//        }
//        catch (IOException  e){
//            e.printStackTrace();
//        }
//
//        File file = new File("pravin.txt");
//
//        try {
//            Scanner s = new Scanner(file);
//            while(s.hasNextLine()){
//                String k = s.nextLine();
//                System.out.println(k);
//            }
//            s.close();
//        }
//        catch (IOException  e){
//
//            e.printStackTrace();
//        }

        // Deleting a file from the manager

        File file = new File("pravin.txt");
        if(file.delete()){

            System.out.println("This file is deleted by me "+ file);
        }
        else {

            System.out.println("This file unable to delete because problem occured during the process");
        }





    }
}

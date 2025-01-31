/*
 * Name: Xavier Green
 * 
 */
package org.howard.edu.lsp.assignment2;

import java.util.Scanner; // Keep this???
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; // Writer and Reader serves to do what their names imply. OpenCSV needs further study. Not experienced enough.

public class ETLPipeline {
    public static void main(String[] args) {

    }

    public static void alterPrice() {

    }

    public static void setPremium() {

    }
    
    public static void createArray() {
        File old = new File("C:\\Users\\xavie\\Documents\\Programming\\Github Repos\\LSP_Zitaly_Repo\\data\\products.csv");
        // This has to return an Array. Figure out how to do that via Java.
        FileReader readthis = new FileReader(old); //Must read input from a relative directory named data located in the project root folder
        /*
         * Path is: JavaProjectRoot/data/products.csv
         * I have to make this universally applicable. Somehow.
         * Code is in src. 
         * data/products.csv?
         * ../data/products.csv? <- Most likely the correct one.
         * Study my own directory. What's the structure?
         * I shouldn't have saved it in my program files.
         * Relative: data\products.csv
         * Abs: C:\Users\xavie\Documents\Programming\Github Repos\LSP_Zitaly_Repo\data\products.csv
         */
        System.out.println(new File(".").getAbsolutePath());
    }

    public static void createCSV() {
        // Needs to take an Array. Figure out how that's possible in Java. Thankfully, I can create a new file.
    }
// Add methods: CSVtoArray, ArraytoCSV
}
/*
 * Needed Info:
 * 1. Read input files from a relative directory named data.
 * 2. Read CSV
 * 2. Transform String and Numbers within the file.
 * 3. Output a changed file.
 */

 /*
  * Cat. 2
  * Go by commas?
  */

  /*
   * Cat. 3
   * T1. If Category = Electronics; price *= 0.90. Rounded to two decimals.
   * T2. Ask professor if this is the same as the standardization in that the first letter is capitalized. "NAME" vs "Name"
   * T3. If Price > 500; Category = Premium Electronics
   * T4. Same implementation as a grade scale. High to low
   * T5. Look at chars. First cut down on leading and tailing space. Char 0, find space in middle, then char right after that.
   *  
   */

   /*
    * Turn the csv into an array?
    * Use Opencsv?
    * First option. Make something that works, then go through opencsv.
    */
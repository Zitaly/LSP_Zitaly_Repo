/*
 * Name: Xavier Green
 * 
 */
package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ETLPipeline {
    public static void main(String[] args) {
        createArray();
    }

    public static void alterPrice() {

    }

    public static void setPremium() {

    }
    
    public static void createArray() {
        Path old = Paths.get("data\\products.csv");
        System.out.println(Files.exists(old));
        System.out.println(Files.isReadable(old));
        List<String> filedata = new ArrayList<String>();
        List<String> headers = new ArrayList<String>(); // First 4 in list. Dedicated loop for these.
        // Everything goes in pattern.
        /*
         * 1 - ID
         * 2 - Name
         * 3 - Price
         * 4 - Category
         */
        List<Integer> id = new ArrayList<Integer>();
        List<String> names = new ArrayList<String>();
        List<Double> prices = new ArrayList<Double>();
        List<String> category = new ArrayList<String>();
        // Make these global
        try {
            filedata = Files.readAllLines(old);
            System.out.println(filedata);
            // Go by category? Make a list for each section, allowing for easy alteration and comparison, since they'll inherit their order.
            for (int i = 0; i < 21; i++)
            {
                String line = filedata.get(i);
                System.out.println(line); // Nevermind, they're saved as lines...
                if (line.isEmpty())
                {
                    continue;
                }
                String[] splitline = line.split(",");
                int count = 1;
                for (String word: splitline)  {
                    if (i == 0) {
                        headers.add(word);
                    }
                    else
                    {
                        if (count == 1)
                        {
                            id.add(Integer.parseInt(word)); // Throws an exception, deal with it.
                        }

                        else if (count == 2)
                        {
                            names.add(word);
                        }

                        else if (count == 3)
                        {
                            prices.add(Double.parseDouble(word));
                        }

                        else if (count == 4)
                        {
                            category.add(word);
                        }
                        count++;
                    }
                }
                /*
                 * 2d loop? Separate each using the commas?
                 */
                
            }
            System.out.println(id);
            System.out.println(names);
            System.out.println(prices);
            System.out.println(category);
        } catch (IOException error) {
            error.printStackTrace();
        }
        // This has to return an Array. Figure out how to do that via Java.
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
        // System.out.println(new File(".").getAbsolutePath());
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
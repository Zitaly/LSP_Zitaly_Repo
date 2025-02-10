/*
 * Name: Xavier Green
 * 
 */
package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ETLPipeline {
    // Notes for the future: If I had more time, I would try to actually do OOP. Next time, I suppose. More study of Java is required.
    public static List<Integer> id = new ArrayList<Integer>();
    public static List<String> names = new ArrayList<String>();
    public static List<Double> prices = new ArrayList<Double>();
    public static List<String> category = new ArrayList<String>();
    public static List<String> headers = new ArrayList<String>(); // First 4 in list. Dedicated loop for these.
    public static List<String> pricerange = new ArrayList<String>();
    public static List<String> finallist = new ArrayList<String>();
    public static void main(String[] args) {
        
        createArray();
        alterPrice();
        standardizeNames();
        addPriceRange();
        finallist.add(headers.get(0) + "," + headers.get(1) + "," + headers.get(2) + "," + headers.get(3) + "," + "PriceRange");
        for (int i = 0; i < id.size(); i++)
        {
            finallist.add(id.get(i) + "," + names.get(i) + "," + prices.get(i) + "," + category.get(i) + "," + pricerange.get(i));
        }
        createCSV();
    }

    public static void alterPrice() {
        // Alters prices for electronics
        for (int i = 0; i < id.size(); i++)
        {
            //Iterate through category and prices at the same time
            if (category.get(i).equals("Electronics"))
            {
                Double newprice = prices.get(i);
                newprice*=0.90;
                newprice = (double) Math.round(newprice * 100.0)/100.0;
                prices.set(i, newprice);
                if (prices.get(i) > 500.0)
                {
                    category.set(i, "Premium Electronics");
                }
            }
        }

    }

    public static void standardizeNames() {

        for (int i = 0; i < names.size(); i ++)
        {
            String isolated = names.get(i);
            names.set(i, isolated.toUpperCase());
        }
    }
    
    public static void createArray() {
        Path old = Paths.get("data\\products.csv");
        //System.out.println(Files.exists(old));
        List<String> filedata = new ArrayList<String>();
        // Everything goes in pattern.
        /*
         * 1 - ID
         * 2 - Name
         * 3 - Price
         * 4 - Category
         */

        // Make these global
        try {
            filedata = Files.readAllLines(old);
            //System.out.println(filedata);
            // Go by category? Make a list for each section, allowing for easy alteration and comparison, since they'll inherit their order.
            for (int i = 0; i < 21; i++)
            {
                String line = filedata.get(i);
                // System.out.println(line); // Nevermind, they're saved as lines...
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
                
            }
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public static void addPriceRange(){ // Checks price and assigns price range
        for (int i = 0; i < id.size(); i++)
        {
            if (prices.get(i) >= 500.01)
            {
                pricerange.add("Premium");
            }
            else if (prices.get(i) >= 100.01)
            {
                pricerange.add("High");
            }
            else if (prices.get(i) >= 10.01)
            {
                pricerange.add("Medium");
            }
            else
            {
                pricerange.add("Low");
            }
        }

    }
    public static void createCSV() 
    {
        // Needs to take an Array. Figure out how that's possible in Java. Thankfully, I can create a new file.
        try 
        {
            Path outputpath = Paths.get("data\\transformed_products.csv");
            Files.createFile(outputpath);
            Files.write(outputpath, finallist);
        } 
        catch (IOException error)
        {
            error.printStackTrace();
        }

            
    };
    
}
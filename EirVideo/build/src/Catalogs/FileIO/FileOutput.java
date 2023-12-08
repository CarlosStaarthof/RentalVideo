/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogs.FileIO;

import Catalogs.Catalog;
import Catalogs.DataIO.DataOutput;
import Products.Product;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public class FileOutput extends FileIO implements DataOutput{
     @Override
    public void saveData(Catalog currentCatalog) {
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename + ".txt"));
            ArrayList<Product> products = currentCatalog.getCatalog();
            
            for (Product product : products) {
                bw.write("Name: " + product.getName() + ", Price: " + product.getPrice());
                bw.newLine(); // Optional, adds a newline after each product
            }
            
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }    
}
}}

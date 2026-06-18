package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ImmutableList<String> fruits= ImmutableList.of("Apple","Banana");
        System.out.println(fruits);
        
        File source= new File("src.txt");
        File destination =new File("dest.txt");
        
        try{
        	FileUtils.copyFile(source, destination);
        }catch(IOException e){
        	System.err.println("Error "+ e.getMessage());
        }
    }
}

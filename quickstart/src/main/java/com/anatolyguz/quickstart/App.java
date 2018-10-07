package com.anatolyguz.quickstart;

import java.io.File;
import java.io.IOException;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       
    	Database db = DatabaseBuilder.open(new File("/home/user/BB_Main.mdb"));
    	db.flush();
    	db.close(); 
    	
    	System.out.println( "Hello World!" );
    }
}

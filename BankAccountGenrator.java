/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package cs_146_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author maninderpalsingh
 */
public class BankAccountGenrator {
    
    File fileName;
    
    FileOutputStream fos;
    
    
    private Long accountNumberGenrator() throws IOException {
        
        fileName = new File("accountNumberGenrate.txt");
        
        long accountN = 100005;
        
        if(fileName.exists()) {
            
            
            FileWriter fw = new FileWriter(fileName, true);
            //    fw.write(data);
            
            // System.out.println(data + " is inserting in method 2");
            Scanner scanner = new Scanner(new File("accountNumberGenrate.txt"));
            
            //System.out.println(scanner.nextInt());
            
            accountN = scanner.nextLong() + 1;
            
            fw.close();
            
            PrintWriter writer = new PrintWriter("accountNumberGenrate.txt");
            writer.print("");
            writer.close();
            
             fw = new FileWriter(fileName, true);
            
            fw.write(new Long(accountN).toString());
            
            fw.close();
        }
        
        if(!fileName.exists()) {
            
            try  {
                FileWriter fw = new FileWriter(fileName, true);
          
                fw.write(new Long(accountN).toString());
                
                fw.close();
                
            }
            catch(IOException ioe)
            {
                System.err.println("IOException: " + ioe.getMessage());
            }
        }
        
        return accountN;
        
    }
   
    
    public String getAccountN() throws IOException {
        String num = Long.toString(accountNumberGenrator());
        
        return num;
    }
   
    
    public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
             BankAccountGenrator B = new BankAccountGenrator();
             

             
             System.out.println(B.getAccountN());

	}
    
}

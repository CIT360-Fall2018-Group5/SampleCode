package json;
import java.io.*;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabel Jenson
 */
public class ReadJSONFile {
    
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        
        try 
        {
        
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            
            String name = (String) jsonObject.get("name");
            System.out.println("Name is:" + name);
        
            String age = (String) jsonObject.get("Age");
            System.out.println("Age is:" + age);
            
            JSONArray coursesArray = (JSONArray) jsonObject.get("Hobbies");
            Iterator<String> iterator = coursesArray.iterator();
            
            while(iterator.hasNext())
            {
                System.out.println("Hobby: " + iterator.next());
            }
         
        }
        
        catch(FileNotFoundException e) {
            e. printStackTrace();
        }
        catch(IOException e) {
            e. printStackTrace();
        }
        catch(ParseException e) {
            e. printStackTrace(); 
        }
        catch(Exception e) {
            e. printStackTrace();
        }
        
        
    }
    
}

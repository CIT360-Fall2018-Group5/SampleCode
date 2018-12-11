/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Isabel Jenson
 */
    
package json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.*;

public class WriteIntoJSONFile {

    public static void main(String[] args) {
       
        
        JSONObject obj = new JSONObject();
        obj.put("name", "Isabel Jenson");
        obj.put("location", "USA");
               
        JSONArray list = new JSONArray();
        list.put("Java"); 
        list.put("JSP");
        list.put("Servlets");
       
        
        obj.put("courses", list);
        
        try(FileWriter file = new FileWriter("myJSON.json")){
        
            file.write(obj.toString());
            file.flush();
        
        }catch(IOException e ) {
            e.printStackTrace();
        }
        
        System.out.println(obj);
    }

}
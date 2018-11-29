package jsondemo;

import java.io.FileWriter;
import java.io.IOException;
import org.json.*;

/**
 *
 * @author Thomas https://www.youtube.com/watch?v=wDVH3qnXv74
 */
public class WriteToJSON {

    public static void main(String[] args) {
       
        
        JSONObject obj = new JSONObject();
        obj.put("name", "Bob Freeber");
               
        JSONArray list = new JSONArray();
        list.put("123 Peach Street"); 
        list.put("Atlanta");
        list.put("GA");
        list.put("23234");
        obj.put("address", list);
        
        try(FileWriter file = new FileWriter("myJSON.json")){
        file.write(obj.toString());
        file.flush();
        
        }catch(IOException e ) {
            e.printStackTrace();
        }
        
        System.out.println(obj);
    }

}

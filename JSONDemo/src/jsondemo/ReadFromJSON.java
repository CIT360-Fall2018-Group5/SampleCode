package jsondemo;

import java.io.*;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Thomas https://www.youtube.com/watch?v=cFCgFlqF5kw&t=76s
 */
public class ReadFromJSON {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String)jsonObject.get("name");
            System.out.println(name);
            
            JSONArray addressArray = (JSONArray) jsonObject.get("address");
            Iterator<Object> iterator = addressArray.iterator();
            
            while(iterator.hasNext())
            {
                System.out.println(iterator.next());
            
            }
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

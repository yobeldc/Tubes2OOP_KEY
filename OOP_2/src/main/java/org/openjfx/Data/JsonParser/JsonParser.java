package org.openjfx.Data.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

 
import org.json.simple.*;
import org.json.simple.parser.*;

public class JsonParser {
    
    // File disimpan pada direktori resources
    public JsonParser(String filename){
        JSONParser jsonParser = new JSONParser();
        String resourcesDirectory = Paths.get(".").toAbsolutePath().normalize().toString() + "/src/main/resources/";
         
        try (FileReader reader = new FileReader(resourcesDirectory+filename))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray theJson = (JSONArray) obj;
            System.out.println(theJson);
             
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

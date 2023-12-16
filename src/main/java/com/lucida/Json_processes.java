package com.lucida;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class Json_processes {
    public static void json_write(String name,String surname,String weight,String height,String key,String gender,String vki) {
        JSONObject data = new JSONObject();
        data.put("name", name);
        data.put("surname", surname);
        data.put("weight", weight);
        data.put("height", height);
        data.put("cinsiyet", gender);
        data.put("key",key);
        data.put("vki",vki);

        JSONArray list=new JSONArray();
        list.add(data);

        try(FileWriter file=new FileWriter(surname+'_'+name+ ".json")){
            file.write(list.toJSONString());
            file.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String json_read(String json_patch,String desired) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        JSONObject data= (JSONObject) parser.parse(new FileReader(json_patch));
        return (String) data.get(desired);
        }
    public static String[] json_all_read(String json_patch) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        JSONObject data= (JSONObject) parser.parse(new FileReader(json_patch));
        String[] select=new String[6];
        select[0]= (String) data.get("name");
        select[1]= (String) data.get("surname");
        select[2]= (String) data.get("weight");
        select[3]= (String) data.get("height");
        select[4]= (String) data.get("gender");
        select[5]= (String) data.get("key");

        return select;
    }

}

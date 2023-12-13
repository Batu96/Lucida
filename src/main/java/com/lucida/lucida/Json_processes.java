package com.lucida.lucida;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Json_processes {
    public static void json_write(String name,int weight,int height,String key) {
        JSONObject data = new JSONObject();
        data.put("name", name);
        data.put("weight", weight);
        data.put("height", height);
        data.put("key",key);

        JSONArray list=new JSONArray();
        list.add(data);

        try(FileWriter file=new FileWriter("registration.json")){
            file.write(list.toJSONString());
            file.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

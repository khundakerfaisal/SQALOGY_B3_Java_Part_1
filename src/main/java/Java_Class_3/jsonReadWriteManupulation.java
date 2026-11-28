package Java_Class_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jsonReadWriteManupulation {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath="src/main/resources/User.json";
        String prefix="User-";
        int autoNumberGeneratorCounter=1;
        int lastNumber=0;
        String autoGenerateNumber="";



        JSONParser jsonParser=new JSONParser();
        JSONArray jsonArray= (JSONArray) jsonParser.parse(new FileReader(filePath)); //File Reader

        if (!jsonArray.isEmpty()){
            JSONObject lastObjectData= (JSONObject) jsonArray.get(jsonArray.size()-1);
            String lastAddedData=lastObjectData.get("UserName").toString();
            lastNumber= Integer.parseInt(lastAddedData.substring(prefix.length()));
        }

        for (int i=1;i<=autoNumberGeneratorCounter;i++){
            autoGenerateNumber=prefix+(lastNumber+i);
            System.out.println(autoGenerateNumber);


            JSONObject jsonData=new JSONObject();
            jsonData.put("UserName",autoGenerateNumber);
            jsonArray.add(jsonData);

        }






        FileWriter writer=new FileWriter(filePath); //Write
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();

    }
}

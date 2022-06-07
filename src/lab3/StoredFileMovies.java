package lab3;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFileMovies {
    private String storedFile;
    private JsonArray memory;

    public StoredFileMovies(String storedFile)
    {
        this.storedFile = storedFile;
        this.memory = read();
    }

    public JsonArray read() {
        JsonArray jsonArray = null;
        try (FileReader reader = new FileReader(storedFile)) 
        {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    public void update(String movieName, String tag, String rate, String description)
    {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("movieName", movieName);
        jsonObject.addProperty("tag", tag);
        jsonObject.addProperty("rate", rate);
        jsonObject.addProperty("description", description);
        memory.add(jsonObject);
    }

    public void write()
    {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(storedFile)) 
        {
            gson.toJson(memory, writer);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int search(String key, String value)
    {
        int index = -1;
        String tempMemory = null;
        for(int i = 0; i < memory.size(); i++)
        {
            JsonObject jsonObject = memory.get(i).getAsJsonObject();
            tempMemory = jsonObject.get(key).getAsString();
            if(value.equals(tempMemory))
            {
                index = i;
                break;
            }
        }
        return index;
    }
}

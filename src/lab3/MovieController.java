package lab3;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MovieController {
    Movie movie;

    public void listMovies()
    {
        JsonArray memory = Movie.getMovies().getAll();
        String movieName;
        String tag;
        String rate;
        String description;

        for(int i = 0; i < memory.size(); i++)
        {
            JsonObject jsonObject = memory.get(i).getAsJsonObject();
            movieName = jsonObject.get("movie").getAsString();
            tag = jsonObject.get("tag").getAsString();
            rate = jsonObject.get("rate").getAsString();
            description = jsonObject.get("description").getAsString();

            System.out.println("no." +(i+1)+ "==");
            System.out.println("movie: " +movieName);
            System.out.println("tag: " +tag);
            System.out.println("rate: " +rate);
            System.out.println("description: " +description);

            try 
            {
                Thread.sleep(1000);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

package lab3;

public class MovieUI {
    MovieController movieController = new MovieController();
    Actions command;

    public String handleCommands(String rep)
    {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if(this.command.equals(Actions.CA))
        {
            return "in danh sach phim";
        }
        else
        {
            return "Unkown command.";
        }
    }

    public void handleInputs()
    {
        if(this.command.equals(Actions.CA))
        {
            movieController.listMovies();
        }
    }
}

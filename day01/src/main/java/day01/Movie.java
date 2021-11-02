package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int appearaceYear;
    private List <Actor> listOfActors = new ArrayList<>();

    public Movie(String title, int appearaceYear) {
        this.title = title;
        this.appearaceYear = appearaceYear;
    }

    public void addActor (Actor actor){
        listOfActors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int inTwenties = 0;
        for (int i = 0; i < listOfActors.size(); i++){
            if (20 <= appearaceYear - listOfActors.get(i).getBirth() && 30 >appearaceYear - listOfActors.get(i).getBirth()  ){
                inTwenties ++;}
            };
        return inTwenties;


    }

    public static void main(String[] args) {
        Actor actor = new Actor("Tom Cruise", 1959);
        Movie movie = new Movie("Rain Man", 1988);

        movie.addActor(actor);
        System.out.println(movie.actorsInTheirTwenties());


        Actor actor2 = new Actor("Dustin Hoffmann", 1958);
        movie.addActor(actor2);
        System.out.println(movie.actorsInTheirTwenties());

        Actor actor3 = new Actor("Valeria Golino", 1968);
        movie.addActor(actor3);
        System.out.println(movie.actorsInTheirTwenties());
    }

}

package polymorphisms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new Movie("Game of Thrones ");
//        Adventure adventure = new Adventure("Star Wars ");
//        Comedy comedy = new Comedy("Groundhog Day ");
//        Movie science =  Movie.getMovie("Science","Game of Thrones ");
//        Movie Adventure =  Movie.getMovie("Ad","Star Wars ");
//        Movie comedy =  Movie.getMovie("Comedy","Groundhog Day ");
//         science.watchMovie();
//         Adventure.watchMovie();
//         comedy.watchMovie();
//                 movie.watchMovie();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, "+
                    "S for science Fiction, or Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter the movie title: ");
            String title = scanner.nextLine();
            Movie movie =  Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}

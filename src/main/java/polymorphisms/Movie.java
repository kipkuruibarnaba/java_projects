package polymorphisms;

public class Movie {
    private  String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + "is "+instanceType +" film");
    }
    public static Movie getMovie(String type,String title){
      return switch (type.toUpperCase().charAt(0)){
          case 'A' ->new  Adventure(title);
          case 'C' ->new Comedy(title);
          case 'S' ->new ScienceFiction(title);
          default -> new Movie(title);
      };
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s,%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something bad happens");
    }
    public void watchingAdventure(){
        System.out.println("Watching an Adventure ");
    }
}
class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s,%n".repeat(3),
                "Something happy happens",
                "Something happier happens",
                "Happy Ending");
    }
    public void watchingComedy(){
        System.out.println("Watching an Comedy ");
    }
}
class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s,%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys chase Aliens",
                "Planet Blows Up");
    }
    public void watchingScienceFiction(){
        System.out.println("Watching an ScienceFiction ");
    }
}
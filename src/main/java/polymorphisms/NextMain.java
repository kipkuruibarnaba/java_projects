package polymorphisms;

public class NextMain {
    public static void main(String[] args) {
        ScienceFiction mov =  (ScienceFiction) Movie.getMovie("Science","Game of Thrones ");
        mov.watchMovie();

        Movie adventure =  Movie.getMovie("Ad","Star Wars ");
        adventure.watchMovie();

        Object comedy =  Movie.getMovie("C","Airplane ");
        Comedy comedyMov = (Comedy)comedy;
        comedyMov.watchMovie();

        var airplane =  Movie.getMovie("C","Airplane two ");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchingComedy();

        Object unknownObject =  Movie.getMovie("C","Airplane ");
        if(unknownObject.getClass().getSimpleName()=="Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchingComedy();
        }else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchingAdventure();
        }else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchingScienceFiction();
        }

    }
}

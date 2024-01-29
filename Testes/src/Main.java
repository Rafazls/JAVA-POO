import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
Comment c1 = new Comment("Have a nice trip!");
Comment c2 = new Comment("Wow that's awesome!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post p1 = new Post(sdf.parse("21/06/2018 13:02:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.print(p1);
    }
}
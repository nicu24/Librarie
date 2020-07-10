import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Log4j
public class Program {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        List<String> readers = new ArrayList<String>();
        List<String> books = new ArrayList<String>();
        List<Integer> shelves = new ArrayList<Integer>();
        int nrBooks = 100;

        for (int i = 0; i < 20 ; i++) {
            readers.add(i,nameGenerator());
        }

        for (int i = 0; i < 20 ; i++) {
            books.add(i,bookGenerator());
        }

        //readers.stream().forEach(a->log.info(a));
        //log.info("--------------------------------------");
        //books.stream().forEach(a->log.info(a));


        Library<Integer> librarius = new Library<Integer>(nrBooks,readers,books,shelves);
        librarius.showReaders();

    }

    public static String nameGenerator()
    {
        String[] names = {"Nicu","Ion","Jora","Mircea","Mihai","Vanea","Iftodi","Macarici","Ivan Ivanici","Ded Maxim"};
        Random random = new Random();
        random.nextInt(10);
        String result = names[random.nextInt(10)];
        return result;
    }
    public static String bookGenerator()
    {
        String[] names = {"Tom Rider","Basma","Fat frumos","Miracol","Secret","Izvorul","Ultimu dintre paminteni","Nelu","Corzina din padure","Mara"};
        Random random = new Random();
        random.nextInt(10);
        String result = names[random.nextInt(10)];
        return result;
    }
}

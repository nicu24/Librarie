import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import java.util.List;
@Log4j
@Getter
@Setter
@AllArgsConstructor
public class Library <T>{
  private int nbBook;
  List<String> readers;
  List<?> books;
  List<T> shelves;

  public void ShowReaders()
  {
      log.info(readers);
  }

  public void ShowBooks()
  {
      log.info(books);
  }
  public void ShowShelves()
  {
      log.info(shelves);
  }

  public void ReaderToBook(List<String> readers , List<T> books){
      

  }


}

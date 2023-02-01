package Java.JavaHomework;
import java.util.ArrayList;

public class Homework_6 {
    public static void main(String[] args) {
        Infrastructure infrastructure = new Infrastructure();
            System.out.println(infrastructure.getAllInfo(1));
        System.out.println(infrastructure.getAllInfo(2));
        System.out.println(infrastructure.getAllInfo(3));
        System.out.println(infrastructure.getAllInfo(4));
        System.out.println();
        System.out.println(infrastructure.findFilm("Инт"));
        System.out.println(infrastructure.findFilm("Фор"));
        System.out.println(infrastructure.findFilm("бет"));
        System.out.println(infrastructure.findFilm("Ничего"));
    
      }
}

class Infrastructure {
    public Infrastructure() {
      init();
    }
  
    Db db;
  
    public Db getDb() {
      return db;
    }
  
    public String getAllInfo(int idCinema) {
      Cinema c = db.films.get(idCinema - 1);
      return String.format("%d %s %s %s",
          c.id,
          c.name,
          db.genres.get(c.genre - 1).name,
          db.prod.get(c.filmProd - 1).titleName);
    }
  
    public String findFilm(String filmName) {
      String result = "";
      Cinema c;
      for (int i = 0; i < db.films.size(); i++) {
        c = db.films.get(i);
        if (c.name.toLowerCase().contains(filmName.toLowerCase()))
          result += c.name + "; ";
      }
      return String.format("Список фильмов по поиску '%s': ", filmName) + result.substring(0, (result.length() - 2));
    }
  
    Db init() {
      db = new Db();
      Cinema c1 = new Cinema(1, "Интелстеллар", 1, 1);
      Cinema c2 = new Cinema(2, "Бетмэн", 1, 2);
      Cinema c3 = new Cinema(3, "Ничего хорошего в отеле Эль Рояль", 2, 4);
      Cinema c4 = new Cinema(4, "Форест Гамп", 3, 3);
      Cinema c5 = new Cinema(4, "Формула 1", 3, 3);
      Cinema c6 = new Cinema(4, "Бетгерл", 3, 3);
      Cinema c7 = new Cinema(4, "Инферно", 3, 3);
  
      db.films.add(c1);
      db.films.add(c2);
      db.films.add(c3);
      db.films.add(c4);
      db.films.add(c5);
      db.films.add(c6);
      db.films.add(c7);
  
      db.genres.add(new Genre(1, "Фантастика"));
      db.genres.add(new Genre(2, "Детектив"));
      db.genres.add(new Genre(3, "Драма"));
      FilmProducerFactory pf = new FilmProducerFactory();
      db.addFilmProducer(pf.getFilmProducer("Нолан"));
      db.addFilmProducer(pf.getFilmProducer("DC"));
      db.addFilmProducer(pf.getFilmProducer("Алабама"));
      db.addFilmProducer(pf.getFilmProducer("Paramaunt"));
  
      return db;
    }
  }
  
  class Db {
    ArrayList<Cinema> films = new ArrayList<>();
    ArrayList<FilmProducer> prod = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();
  
    public void addFilmProducer(FilmProducer producer) {
      prod.add(producer);
    }
  }
  
  class Cinema {
    int id;
    int filmProd;
    String name;
    int genre;
  
    public Cinema(int id, String name, int genre, int filmProd) {
      this.id = id;
      this.filmProd = filmProd;
      this.name = name;
      this.genre = genre;
    }
  }
  
  class FilmProducer {
    int id;
    String titleName;
  }
  
  class Genre {
    int id;
    String name;
  
    public Genre(int id, String name) {
      this.id = id;
      this.name = name;
    }
  }
  
  class FilmProducerFactory {
    int count = 1;
  
    public FilmProducer getFilmProducer(String name) {
      FilmProducer fp = new FilmProducer();
      fp.id = count++;
      fp.titleName = name;
      return fp;
    }
  }
  
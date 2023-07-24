import org.example.FilmManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void nothingAddedTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm(" ");


        String[] expected = {" "};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingOneFilmTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm(" Фильм_1 ");


        String[] expected = {" Фильм_1 "};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingThreeFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Фильм_1");
        manager.addFilm("Фильм_2");
        manager.addFilm("Фильм_3");


        String[] expected = {"Фильм_1", "Фильм_2", "Фильм_3"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputTwoLastFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Фильм_1");
        manager.addFilm("Фильм_2");



        String[] expected = {"Фильм_2", "Фильм_1"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputThreeLastFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Фильм_1");
        manager.addFilm("Фильм_2");
        manager.addFilm("Фильм_3");


        String[] expected = {"Фильм_3", "Фильм_2", "Фильм_1"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputNothingLastFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm(" ");

        String[] expected = {" "};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputLast5FilmsTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Фильм_1");
        manager.addFilm("Фильм_2");
        manager.addFilm("Фильм_3");
        manager.addFilm("Фильм_4");
        manager.addFilm("Фильм_5");
        manager.addFilm("Фильм_6");
        manager.addFilm("Фильм_7");
        manager.addFilm("Фильм_8");


        String[] expected = {"Фильм_8", "Фильм_7", "Фильм_6", "Фильм_5", "Фильм_4"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void outputLastFilmsLimit3TestTest() {
        FilmManager manager = new FilmManager(3);

        manager.addFilm("Фильм_1");
        manager.addFilm("Фильм_2");
        manager.addFilm("Фильм_3");
        manager.addFilm("Фильм_4");
        manager.addFilm("Фильм_5");
        manager.addFilm("Фильм_6");
        manager.addFilm("Фильм_7");
        manager.addFilm("Фильм_8");


        String[] expected = {"Фильм_8", "Фильм_7", "Фильм_6"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}



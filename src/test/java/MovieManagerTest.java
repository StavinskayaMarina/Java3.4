import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void addFiveMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("1, Бладшот");
        manager.addMovie("2, Вперёд");
        manager.addMovie("3, Отель Белград");
        manager.addMovie("4, Джентельмены");
        manager.addMovie("5, Человек-невидимка");


        String[] expected = {
                "1, Бладшот", "2, Вперёд", "3, Отель Белград", "4, Джентельмены", "5, Человек-невидимка"
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("1, Бладшот");

        String[] expected = {"1, Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addTenMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("1, Бладшот");
        manager.addMovie("2, Вперёд");
        manager.addMovie("3, Отель Белград");
        manager.addMovie("4, Джентельмены");
        manager.addMovie("5, Человек-невидимка");
        manager.addMovie("6, Тролли. Мировой тур");
        manager.addMovie("7, Номер один");
        manager.addMovie("8, Темный рыцарь");
        manager.addMovie("9, Ципленок Цыпа");
        manager.addMovie("10, Один дома");

        String[] expected = {
                "1, Бладшот", "2, Вперёд", "3, Отель Белград", "4, Джентельмены", "5, Человек-невидимка", "6, Тролли. Мировой тур", "7, Номер один", "8, Темный рыцарь", "9, Ципленок Цыпа", "10, Один дома"
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addNullMovie() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void latestFilmsByLimit() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("1, Бладшот");
        manager.addMovie("2, Вперёд");
        manager.addMovie("3, Отель Белград");
        manager.addMovie("4, Джентельмены");
        manager.addMovie("5, Человек-невидимка");
        manager.addMovie("6, Тролли. Мировой тур");
        manager.addMovie("7, Номер один");
        manager.addMovie("8, Темный рыцарь");
        manager.addMovie("9, Ципленок Цыпа");
        manager.addMovie("10, Один дома");

        String[] expected = {
                "10, Один дома", "9, Ципленок Цыпа", "8, Темный рыцарь", "7, Номер один", "6, Тролли. Мировой тур"
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void latestMoviesLessLimit() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("1, Бладшот");
        manager.addMovie("2, Вперёд");
        manager.addMovie("3, Отель Белград");


        String[] expected = {
                "3, Отель Белград", "2, Вперёд", "1, Бладшот",
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}

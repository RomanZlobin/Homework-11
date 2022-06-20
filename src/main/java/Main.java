import ru.netology.domain.Affiche;
import ru.netology.managers.FilmManager;

public class Main {
    public static void main(String[] args) {
        Affiche one = new Affiche(1, "Brat", "action");
        Affiche two = new Affiche(2, "Brat 2", "action");
        Affiche three = new Affiche(3, "Gruz 200", "trash");
        Affiche four = new Affiche(4, "Zhmurki", "comedy");
        Affiche five = new Affiche(5, "Voina", "drama");
        Affiche six = new Affiche(6, "Pro urodov i lyudey", "comedy");
        Affiche seven = new Affiche(7, "Zamok", "drama");
        Affiche eight = new Affiche(8, "Morfiy", "drama");
        Affiche nine = new Affiche(9, "Kochegar", "criminal drama");
        Affiche ten = new Affiche(10, "ya tozhe hochu", "criminal drama");
        Affiche eleven = new Affiche(11, "Mne ne bolno", "melodrama");

        FilmManager manager = new FilmManager();
        manager.add (one);
        manager.add (two);
        manager.add (three);
        manager.add (four);
        manager.add (five);
        manager.add (six);
        manager.add (seven);
        manager.add (eight);
        manager.add (nine);
        manager.add (ten);
        manager.add (eleven);

        Affiche[] all = manager.findAll();
        Affiche[] last = manager.findLast();
    }
}

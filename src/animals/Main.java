package animals;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("газель", 3,
                "саванна", 70.0, "трава");
        Herbivores giraffe = new Herbivores(" жираф ", 12,
                " саванна ",60.0, " растения ");
        Herbivores hors = new Herbivores(" лошадь ", 15,
                " одомашнена ", 80, " трава, сено ");
        Herbivores hors1 = new Herbivores(" лошадь ", 15,
                " одомашнена ", 80, " трава, сено ");

        System.out.println(gazelle + "\n" + giraffe + "\n" + hors + "\n" + hors1 + "\n" + hors.equals(hors1));

        Predators hyena = new Predators(" гиена ", 5,
                " саванна ", 70.0, " мясо, падаль ");
        Predators tiger = new Predators(" тигр ", 20,
                " джунгли, лес ", 70.0, " мясо, рыба ");
        Predators bear = new Predators(" медведь ", 7,
                " лес ", 60.0, " мясо, рыба, растения ");

        System.out.println(hyena + "\n" + tiger + "\n" + bear);

        Amphibians frog = new Amphibians(" лягушка ", 1, " болото ");
        Amphibians alreadyFreshwater = new Amphibians(" уж пресноводный ", 2, " болото, лес ");

        System.out.println(frog + "\n" + alreadyFreshwater);

        Flightless peacock = new Flightless(" павлин ", 3,
                " тропический лес ", " ходьба на двух ногах ");
        Flightless penguin = new Flightless(" пингвин ", 5,
                " Антарктида и близлежащие острова ", " ходьба на двух ногах ");
        Flightless dodo = new Flightless(" додо ", 3,
                " тропический лес ", " ходьба на двух ногах ");

        System.out.println(peacock + "\n" + penguin + "\n" + dodo);

        Flying gull = new Flying(" чайка ", 5,
                " вся прибрежная территория ", " полёт ");
        Flying albatross = new Flying(" альбатрос ", 6,
                " северные морские побережья ", " полёт, планирование ");
        Flying falcon = new Flying(" сокол ", 11,
                " степь ", " полёт, планирование, пикирование ");

        System.out.println(gull + "\n" + albatross + "\n" + falcon);
    }

}
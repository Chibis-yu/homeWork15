import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Гарри Поттер", 90, 91, 92, 100, 94);
        Griffindor germionaGreyndzher = new Griffindor("Гермиона Грейнджер", 89, 90, 91, 92, 93);
        Griffindor ronUizli = new Griffindor("Рон Уизли", 80, 77, 90, 91, 92);

        Slizerine drakoMalfoy = new Slizerine("Драко Малфой", 90, 91, 92, 93, 94, 95, 96);
        Slizerine grakhenMontegyu = new Slizerine("Грэхен Монтегю", 87, 88, 89, 90, 91, 92, 93);
        Slizerine gregoryGoyl = new Slizerine("Грегори Гойл", 88, 86, 85, 88, 89, 90, 90);

        Puffenduy zakhariyaSmit = new Puffenduy("Захария Смит", 86, 87, 88, 89, 90);
        Puffenduy sedrikDiggory = new Puffenduy("Седрик Диггори", 94, 85, 86, 87, 88);
        Puffenduy dzhastinFinchFletchly = new Puffenduy("Джастин Финч-Флетчли", 84, 85, 86, 87, 88);

        Kogtevran chzhouChang = new Kogtevran("Чжоу Чанг", 90, 84, 85, 84, 90, 91);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 86, 87, 88, 89, 96, 91);
        Kogtevran marcusBelby = new Kogtevran("Маркус Белби", 85, 86, 87, 88, 89, 90);


        harryPotter.studentCompareHogvarts(drakoMalfoy);
        chzhouChang.studentCompareHogvarts(sedrikDiggory);
        harryPotter.studentCompareGriffindor(ronUizli);
        germionaGreyndzher.studentCompareGriffindor(ronUizli);
        grakhenMontegyu.studentCompareSlizerine(gregoryGoyl);
        zakhariyaSmit.studentComparePuffenduy(dzhastinFinchFletchly);
        padmaPatil.studentCompareKogtevran(marcusBelby);
    }
}
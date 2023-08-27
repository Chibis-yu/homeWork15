import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hogvarts[] hogvarts = {
                new Griffindor("Гарри Поттер", 90, 87, 96, 99, 99),
                new Griffindor("Гермиона Грейнджер", 89, 90, 91, 92, 93),
                new Griffindor("Рон Уизли", 84, 85, 86, 87, 88),

                new Slizerine("Драко Малфой", 90, 91, 92, 93, 94, 95, 96),
                new Slizerine("Грэхэн Монтегю", 84, 85, 86, 87, 88, 89, 90),
                new Slizerine("Грегори Гойл", 81, 82, 83, 84, 85, 86, 87),

                new Puffenduy("Захария Смит", 94, 93, 92, 100, 90),
                new Puffenduy("Седрик Диггори", 93, 92, 91, 90, 89),
                new Puffenduy("Джастин Финч-Флетчли", 100, 99, 98, 97, 96),

                new Kogtevran("Чжоу Чанг", 90, 95, 84, 92, 85, 84),
                new Kogtevran("Падма Патил", 86, 87, 88, 89, 96, 91),
                new Kogtevran("Маркус Белби", 85, 86, 87, 88, 89, 90),
        };

        for (int i = 0; i < hogvarts.length; i++) {
            for (int j = i++; j < hogvarts.length - 1; j++) {
                    hogvarts[i].compare(hogvarts[i]);
                }
            }
        Griffindor harry = (Griffindor) hogvarts[0];
        Griffindor germ = (Griffindor) hogvarts[1];

        harry.compare(germ);
        }
    }

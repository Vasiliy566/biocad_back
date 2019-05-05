package events;
import java.io.File;
import java.util.ArrayList;
//import javafx.scene.control.DatePicker;

/*
1. Название;
2. Спикер;
3. Тип мероприятия;
4. Описание - предусмотреть возможность кастомизации оформления текстом;
5. Флаг - является ли это обучением (задел на будущее);
6. Место проведения;
7. Уровень доступа к записи (кто может записываться), закрытое/не закрытое;
8. Если закрытое, то кто приглашен, или кому можно записаться;
9. Ведущий мероприятия (кто проводит);
10. Статус мероприятия;
11. Допустимое количество участников;
12. Датапикер начала и окончания мероприятия;
13. Теги;
14. Приложенные файлы.
* */
enum event_type{ // спросить про возмжные типа мероприятий
    MEETUP,
    CONFERENCE,
    Interview
}
enum place{ // спросить про возмжные места
    PLACE1,
    PLACE2,
    PLACE3
}
enum status{ // Добавть возможные статусы про которые тоже уточнить
    PLANNED,
    APPROVED,
    CANCELED
}
public class event {
    private static String name;
    private static String speaker;  // ведущий
    private String director; // организатор
    private event_type type;
    private String description;
    private int flag;
    private place place;
    private boolean access_level;
    private ArrayList<String>  authorized_guests; // пустой если acess_level = true ( открытое мероприятие )
    private status status;
    private int max_participant;
    //private DatePicker datePicker; // Разобраться что это за класс (https://vaadin.com/components/vaadin-date-picker/java-examples)
    private ArrayList<String>  tags;
    private ArrayList<File> files;


    static  String get_name(){
        return name;
    }
    static String get_speaker(){
        return speaker;
    }

    event(){
        name = "test_event";
        speaker = "Vasily";
    }
    public static void main(String[] args){
        event test_event = new event();
        System.out.println("event name: " + test_event.get_name() + "\nevent speaker: "+ test_event.get_speaker());
    }

}

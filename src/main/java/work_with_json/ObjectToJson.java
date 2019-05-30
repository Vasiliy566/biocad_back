package work_with_json;

import java.io.IOException;
import java.io.File;
import com.google.gson.Gson;
//import org.codehaus.jackson.map.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import events.Event;

public class ObjectToJson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Event event = createEvent();
        System.out.println(event.getName() + event.getSpeaker());
        String jsonString = "";
        try {

            // Java objects to JSON file
            //mapper.disable(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS);
            mapper.writeValue(new File("./event.json"), event);

            // Java objects to JSON string - compact-print
            jsonString = mapper.writeValueAsString(event);

            System.out.println(jsonString);

            // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(event);

            System.out.println(jsonInString2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson g = new Gson();
        Event person = g.fromJson(jsonString, Event.class);
        System.out.println(person.getName());
    }


    // Get the data to be inserted into the object
    private static Event createEvent() {

        Event event = new Event();

        event.setName("GucciBus");
        event.setSpeaker("Pedro");

        return event;
    }

}
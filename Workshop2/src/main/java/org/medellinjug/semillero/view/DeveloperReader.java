package org.medellinjug.semillero.view;

import org.medellinjug.semillero.model.Developer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class DeveloperReader {

    private static final CopyOnWriteArrayList<Developer> eList = new CopyOnWriteArrayList<>();

    static {


        String jsonString = "[{\"id\":1,\"firstName\":\"Patricia\",\"lastName\":\"Uribe\"},{\"id\":2,\"firstName\":\"Hillmer\",\"lastName\":\"Chona\"}]";


        try {

            ObjectMapper mapper = new ObjectMapper();

            Developer[] myDevelopers = mapper.readValue(jsonString, Developer[].class);

            eList.addAll(Arrays.asList(myDevelopers));

        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

    }

    private DeveloperReader(){}

    public static CopyOnWriteArrayList<Developer> getInstance(){
        return eList;
    }

}

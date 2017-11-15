package org.medellinjug.semillero.view;

import org.medellinjug.semillero.model.Developer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class DeveloperServiceBean {

    private final CopyOnWriteArrayList<Developer> eList = DeveloperReader.getInstance();


    public List<Developer> getAllDevelopers(){
        return eList;
    }

    public Developer getDeveloper(long id){
        Developer match = null;

        match = eList.stream()
                .filter(e -> e.getId() == id)
                .findFirst().orElse(match);

        return match;
    }


    public List<Developer> getDeveloperssForFirstName(String name) {
        if(name!=null){
            return  eList.stream().filter(p -> p.getFirstName().toUpperCase().contains(name.toUpperCase())).collect(Collectors.toList());
        }else{
            return eList;
        }


    }

    public List<Developer> getDeveloperssFoLastName(String lastName) {
        if(lastName!=null){
            return  eList.stream().filter(p -> p.getFirstName().toUpperCase().contains(lastName.toUpperCase())).collect(Collectors.toList());
        }else{
            return eList;
        }


    }


    public boolean add(Developer developer){
        long next = eList.size() + 1;

        Developer nextEmployee =
                new Developer( next, developer.getFirstName(), developer.getLastName());

        eList.add(nextEmployee);
        return true;
    }


    public boolean update(long id, Developer developer){
        int matchIndex = -1;

        matchIndex = eList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .map(e -> eList.indexOf(e))
                .orElse(matchIndex);

        if (matchIndex > -1){
            eList.set(matchIndex, developer);
            return true;
        } else {
            return false;
        }

    }


    public boolean delete(long id){
        int matchIndex = -1;

        matchIndex = eList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .map(e -> eList.indexOf(e))
                .orElse(matchIndex);

        if (matchIndex > -1){
            eList.remove(matchIndex);
            return true;
        } else {
            return false;
        }
    }
}

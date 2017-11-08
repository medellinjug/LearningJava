package org.medellinjug.semillero.model;


import org.medellinjug.semillero.view.DeveloperServiceBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/developers")
public class DeveloperController {

    DeveloperServiceBean developerServiceBean = new DeveloperServiceBean();

    // Get all developers
    @RequestMapping(method = RequestMethod.GET)
    public List<Developer> getAll() {
        return developerServiceBean.getAllDevelopers().stream().collect(Collectors.toList());
    }


    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity get(@PathVariable long id) {

        Developer match = null;
        match = developerServiceBean.getDeveloper(id);

        if (match != null) {
            return new ResponseEntity<>(match, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

//Get developer for first name
    @RequestMapping(method = RequestMethod.GET, value = "/firstName/{name}")
    public ResponseEntity get(@PathVariable String name) {

        List<Developer> matchList= developerServiceBean.getDeveloperssForFirstName(name);

        if (matchList.size()>0) {
            return new ResponseEntity<>(matchList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    //get developer for last name


    // Add an developer
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody Developer developer) {
        if (developerServiceBean.add(developer)) {
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update an developer
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public ResponseEntity update(@PathVariable long id, @RequestBody Developer developer) {

        if (developerServiceBean.update(id, developer)) {
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    // Delete a developer
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity delete(@PathVariable long id) {

        boolean result = developerServiceBean.delete(id);

        if (result) {
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}

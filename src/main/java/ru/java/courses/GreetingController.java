package ru.java.courses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello, letsCode!");
        return "main";
    }


   /* @PostMapping
    public String add(@RequestParam String nameLanguage, Map<String, Object> model){
        Course course = new Course(nameLanguage);
        CourseRepo.save(course);

        Iterable<Course> courses = courseRepo.findAll();
        model.put("courses", courses);

        return "main";
    }*/


}

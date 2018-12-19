package com.ectr.commander.function;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping
    public String testPage() {
        JobRunner jobRunner = new JobRunner();

        return jobRunner.readKafka();
    }
}

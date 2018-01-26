package com.example.concurrence.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by cuiyy on 2018/1/10.
 */
@Controller
public class SseController {

    @ResponseBody
    @RequestMapping(value = "/push", produces = "text/event-stream")
    public String push() throws InterruptedException {
        Random r = new Random();
        Thread.sleep(5000);
        return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
    }

    @RequestMapping(value = "/sse", method = RequestMethod.GET)
    public String sse() {
        return "sse";
    }
}

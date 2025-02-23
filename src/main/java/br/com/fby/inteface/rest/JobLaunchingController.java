package br.com.fby.inteface.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/job-launching-controller")
public class JobLaunchingController {

    @GetMapping("private")
    public String getMessage() {
        return "Hello from private API controller";
    }
}

<<<<<<< HEAD
package me.geetprince.SpringBootGradleApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class princeControler {
    @GetMapping("/")
    public String getInfo(){
        return "My name is prince";
    }
}
=======
package me.geetprince.SpringBootGradleApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class princeControler {
    @GetMapping("/")
    public String getInfo(){
        return "My name is prince";
    }
}
>>>>>>> e7229e4e012fdb6b1d47d4d1f5ed600e2e5b7960

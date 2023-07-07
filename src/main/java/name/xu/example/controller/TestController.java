package name.xu.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public Object get(@RequestParam("param") String param) {
        String sb = "服务正在运行: GraalVM" +
                "server is running: GraalVM";
        return sb;
    }
}

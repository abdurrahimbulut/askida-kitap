package askida.kitap.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    private RedisTemplate<String, String> template;

    public Hello(RedisTemplate<String, String> redisTemplate){
        this.template = redisTemplate;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping({"/hello/redis"})
    public String redis() {
        String deneme = "";
        this.template.opsForValue().set("asdsa", "Redis running");
        deneme = (String)this.template.opsForValue().get("asdsa");
        return deneme;
    }

}

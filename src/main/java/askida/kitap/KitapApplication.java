package askida.kitap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KitapApplication {
	@RequestMapping("/")
	public String home() {
		return "Hello 54564";
	}
	public static void main(String[] args) {
		SpringApplication.run(KitapApplication.class, args);
	}

}

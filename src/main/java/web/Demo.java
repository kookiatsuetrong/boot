package web;                       // src/main/java/web/Demo.java
import org.springframework.ui.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class Web {
	@GetMapping("/")
	String showHome(Model model) {
		model.addAttribute("brand", "iCoffee");
		return "home";
	}
}


@RestController
class Service {
	@GetMapping("/test")
	String[] showTest() {
		String[] data = {"Latte", "Mocha", "Espresso"};
		return data;
	}
}


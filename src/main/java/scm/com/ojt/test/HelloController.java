package scm.com.ojt.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h2>HelloController Class</h2>
 * <p>
 * Process for Displaying HelloController
 * </p>
 * 
 * @author SuThinzarNwe
 *
 */
@Controller
public class HelloController {
	
	/**
	 * <h2>display</h2>
	 * <p>
	 * To display index
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	@RequestMapping("/")
	public String display() {

		return "index";
	}
}

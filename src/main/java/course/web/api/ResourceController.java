package course.web.api;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/data",
								produces="application/json")
@CrossOrigin(origins="*")
public class ResourceController {
	
	@GetMapping("/schools/{id}")
	public Map<String, String> 
		schoolsByDepartmentId(@PathVariable("id") String id) {

		return MajorConversion.getSchool(id);
	}
	
}

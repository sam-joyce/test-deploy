//package com.example.greeting;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//import static java.lang.Integer.parseInt;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:3000")
//public class GreetingController {
//
//    @Autowired
//    GreetingRepository repository;
//
//    // ResponseEntity
//    // WHY? allows us to configure/fine-tune the HTTP response that is sent back when our endpoint is hit
//    // represents the status code, headers and body of the response
//    // ResponseEntity is a generic type, so we can return any type in the body
//
//    // TAKING INPUT FROM URL
//    // 1. path variable
//    // add additional variable to endpoint ({name})
//    // pass annotation to method (can be multiple... in which case just comma separate
//    // add parenthesis after annotation if the url variable doesn't match the method argument
//    @GetMapping("/greeting/{id}")
//    public Greeting getCustomGreeting(@PathVariable String id) {
//        // While “find” might lead to no result at all, “get” will always return something – otherwise the JPA repository throws an exception.
//        return repository.findByid(parseInt(id));
////        return greetings.stream()
////                .filter(greeting -> greeting.getId() == parseInt(id))
////                .findFirst()
////                .orElse(null);
//    }
//
//    // 2. request param
//    // no need to add a variable to the endpoint
//    // pass annotation(s) to method
//    // format for hitting this endpoint is
//    // http://localhost:8080/greeting?name=Sam
//    // for multiple... add another method argument and separate with '&'
//    //	@GetMapping("/greeting")
//    //	public String getCustomGreeting(@RequestParam String name) {
//    //		return "Hello " + name;
//    //	}
//
//    // how would I interact with this from React app
//    // const getGreetings = () => {
//    // 	fetch(localhost:8080/greetings)
//    //		.then(res => res.json()
//    //      .then(data => setGreetings(data))
//    // }
//    @GetMapping("/greetings")
//    public ResponseEntity<List<Greeting>> getGreetings() {
//        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
//    }
//
//    @PostMapping("/greeting")
//    public ResponseEntity<String> createGreeting(@RequestBody Greeting greeting) {
//        // we can add our own validation... then configure the HTTP response code, along with the body, for that specific error
//        if (greeting.getGreeting().length() < 2) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Greeting too short");
//        } else {
//             // greetings.add(greeting);
//            repository.save(greeting);
//            return ResponseEntity
//                    .status(HttpStatus.CREATED)
//                    .header("custom header", "sam")
//                    .body("Greeting added: " + greeting.getGreeting());
//        }
//    }
//
//    @DeleteMapping("/greeting/{id}")
//    @Transactional
//    public ResponseEntity<String> deleteGreeting(@PathVariable String id) {
////        repository.deleteById(parseInt(id));
//        repository.deleteByid(parseInt(id));
//        // greetings.remove(greeting);
//        return ResponseEntity.status(HttpStatus.OK).body("Greeting with id " + id + " has been deleted");
////        for (Greeting greeting: greetings) {
////            if (greeting.getId() == parseInt(id)) {
////                repository.delete(greeting);
////                // greetings.remove(greeting);
////                return ResponseEntity.status(HttpStatus.OK).body(greeting.getGreeting() + " has been deleted");
////            }
////        }
////        return ResponseEntity.status(HttpStatus.OK).body("None to delete");
//    }
//}

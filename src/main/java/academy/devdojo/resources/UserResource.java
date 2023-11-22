package academy.devdojo.resources;

import academy.devdojo.domain.UserEntity;
import academy.devdojo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}

package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.User;
import kr.hs.dgsw.shopping_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/finduser")
    public User findUser(@RequestParam String account ,@RequestParam String password){
        return this.userService.findUser(account, password);
    }

    @GetMapping("/findaccount/{account}")
    public User findAccount(@PathVariable String account){
        return userService.findAccount(account);
    }

    @PostMapping("/adduser")
    public Long add(@RequestBody User user){
        return this.userService.add(user);
    }
}

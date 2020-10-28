package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping()
    public String getUsers(Model model,
                           @RequestParam("page") Optional<Integer> page,
                           @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(15);

        List<Users> lists = usersService.getAll();

        Page<Users> bookPage = usersService.findPaginated(PageRequest.of(currentPage - 1,
                pageSize), lists);
        model.addAttribute("users", bookPage);

        int totalPages = bookPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("userAttribute", new Users());
        return "usershome";
    }

    @RequestMapping(value = "/group/{id}", method = RequestMethod.GET)
    public String getByGroup(Model model,
                             @PathVariable(value = "id") Integer id) {
        List<Users> lists = usersService.getUsersByGroup(id);
        model.addAttribute("users", lists);
        return "usershome";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String add(Users user) {
        usersService.addUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable(value = "id") Integer id) {
        usersService.deleteUser(id);
        return "redirect:/users";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String updateUser(Users user) {
        usersService.updateUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/getChairman", method = RequestMethod.GET)
    public String getChairman(Model model) {
        List<Users> listChairman = usersService.getAllChairman();
        model.addAttribute("users", listChairman);
        return "usershome";
    }
}

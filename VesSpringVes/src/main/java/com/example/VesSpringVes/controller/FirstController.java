package com.example.VesSpringVes.controller;

import com.example.VesSpringVes.entity.UsersEntity;
import com.example.VesSpringVes.model.UserModel;
import com.example.VesSpringVes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class FirstController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/usersList")
    public String getAllUsers(Model model){
        List<UsersEntity> usersEntities = userService.findAll();

        List<UserModel> userModels = new ArrayList<>();

        for (UsersEntity usersEntity: usersEntities){

            UserModel dto = new UserModel();

            dto.setId(usersEntity.getId());
            dto.setName(usersEntity.getName());
            dto.setSecondName(usersEntity.getSecondname());
            dto.setLastName(usersEntity.getLastname());
            userModels.add(dto);
        }
        model.addAttribute("usersEntity", userModels);
        return "list";
    }

    @GetMapping(value = "/")
    public String getAdd(Model model){
        model.addAttribute("userAttribute", new UsersEntity());
        return "add-list";
    }

    @PostMapping(value = "/add")
    public String postAdd(@ModelAttribute("userAttribute") UsersEntity usersEntity){
        userService.addUsers(usersEntity);
        return "redirect:/usersList";
    }

    @GetMapping("/delete")
    public String getDelete(@RequestParam("id") Integer id){
        userService.deleteUsers(id);
        return "redirect:/usersList";
    }

    @GetMapping(value = "/edit")
    public String getEdit(@RequestParam(value = "id") @ModelAttribute("userAttribute") Integer id, Model model){
        UsersEntity exictingUser = userService.findById(id);
        model.addAttribute("userAttribute", exictingUser);
        return "edit-list";
    }

    @PostMapping(value = "/edit")
    public String postEdit(@RequestParam(value = "id")  Integer id,
                           @ModelAttribute("userAttribute") UsersEntity usersEntity){
        usersEntity.setId(id);
        userService.editUser(usersEntity);
        return "redirect:/usersList";
    }

}

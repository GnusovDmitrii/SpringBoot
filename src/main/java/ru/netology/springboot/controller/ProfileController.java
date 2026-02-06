package ru.netology.springboot.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.springboot.profile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {

    private final SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}

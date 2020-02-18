package io.lcalmsky.starbucks.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/starbucks")
public class StarbucksController {

    @GetMapping("/menu")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<Menu> getMenu(Page page) {
        return null;
    }
}

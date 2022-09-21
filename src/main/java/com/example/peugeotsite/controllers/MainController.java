package com.example.peugeotsite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Nick Musinov e-mail:n.musinov@gmail.com
 * 12.09.2022
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/museum")
    public String getMuseum() {
        return "museum";
    }

    @GetMapping("/history")
    public String getHistory() {
        return "history";
    }

    @GetMapping("/models")
    public String getModels() {
        return "models";
    }

    @GetMapping("/about")
    public String getContacts() {
        return "about";
    }

    @GetMapping("/lion-va")
    public String getLionVa() {
        return "lion-va";
    }

    @GetMapping("/bebe")
    public String getBebe() {
        return "bebe";
    }

    @GetMapping("/landaulet")
    public String getLandaulet() {
        return "landaulet";
    }

    @GetMapping("/peugeot_201")
    public String get201() {
        return "201";
    }

    @GetMapping("/peugeot_301")
    public String get301() {
        return "301";
    }

    @GetMapping("/peugeot_401")
    public String get401() {
        return "401";
    }

    @GetMapping("/peugeot_202")
    public String get202() {
        return "202";
    }

    @GetMapping("/peugeot_203")
    public String get203() {
        return "203";
    }

    @GetMapping("/peugeot_204")
    public String get204() {
        return "204";
    }

    @GetMapping("/peugeot_205")
    public String get205() {
        return "205";
    }

    @GetMapping("/peugeot_302")
    public String get302() {
        return "302";
    }

    @GetMapping("/peugeot_304")
    public String get304() {
        return "304";
    }

    @GetMapping("/peugeot_309")
    public String get309() {
        return "309";
    }

    @GetMapping("/peugeot_402")
    public String get402() {
        return "402";
    }

    @GetMapping("/peugeot_403")
    public String get403() {
        return "403";
    }

    @GetMapping("/peugeot_404")
    public String get404() {
        return "404";
    }

    @GetMapping("/peugeot_405")
    public String get405() {
        return "405";
    }

    @GetMapping("/peugeot_406")
    public String get406() {
        return "406";
    }

    @GetMapping("/peugeot_504")
    public String get504() {
        return "504";
    }

    @GetMapping("/peugeot_505")
    public String get505() {
        return "505";
    }

    @GetMapping("/vlv")
    public String getvlv() {
        return "vlv";
    }

    @GetMapping("/peugeot_104")
    public String get104() {
        return "104";
    }

    @GetMapping("/peugeot_106")
    public String get106() {
        return "106";
    }
}

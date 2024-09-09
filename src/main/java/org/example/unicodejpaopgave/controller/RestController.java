package org.example.unicodejpaopgave.controller;


import org.example.unicodejpaopgave.model.Unicode;
import org.example.unicodejpaopgave.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    UnicodeRepository unicodeRepository;

    @GetMapping("/unicode/{i}")
    public String unicode(@PathVariable int i) {
        char c = (char) i;
        return "unicode " + i + " char = " + c;
    }

    @GetMapping("/char/{c}")
    public String char1(@PathVariable char c) {
        int i = (int) c;
        return "char " + c + " int = " + i;

    }

    @GetMapping("/unicode/{bogstav}/{antal}")
    public List<Unicode> endPoint(@PathVariable char bogstav, @PathVariable int antal) {
        List<Unicode> bogstaver = new ArrayList<>();
        Unicode unicode = new Unicode();
        unicode.setBogstav(bogstav);
        unicode.setUnicode((int) bogstav);
        unicodeRepository.save(unicode);
        for (int i = 0; i < antal; i++) {
            bogstaver.add(unicode);
        }
        return bogstaver;
    }
}

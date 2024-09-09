package org.example.unicodejpaopgave.config;

import org.example.unicodejpaopgave.model.Unicode;
import org.example.unicodejpaopgave.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Set<Unicode> unicodes = new HashSet<>();
        Unicode unicode1 = new Unicode();
        unicode1.setUnicode(106);
        unicode1.setBogstav('J');
        unicode1.setDescription("Mit navn starter med j");
        unicode1.setName("Jawad");
        unicodes.add(unicode1);
        unicodeRepository.save(unicode1);
    }
}

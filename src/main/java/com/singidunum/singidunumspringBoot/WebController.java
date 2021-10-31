package com.singidunum.singidunumspringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController
{
    @Autowired
    private StanDaoService srv;


    @GetMapping(path="welcome")
    public String hello()
    {
        return "Dobro dosli na sajt zgrade!";
    }

    @GetMapping(path="/stana1")
    public Stan stan()
    {
        return srv.findFlat(1);
    }

    @GetMapping(path="stan/{id}")
    public Stan stan (@PathVariable int id)
    {
        return srv.findFlat(id);
    }

    @GetMapping(path="stan/svi")
    public List<Stan> allFlats()
    {
        return srv.allFlats();
    }

    @GetMapping(path="stan/dostupni")
    public List<Stan> AvailableFlats()
    {
        return srv.availableFlats();
    }

    @GetMapping(path="stan/sortirani-po-velicini")
    public List<Stan> sortedBySize()
    {
        return srv.sortedBySize();
    }
}

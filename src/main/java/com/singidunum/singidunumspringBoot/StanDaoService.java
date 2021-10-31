package com.singidunum.singidunumspringBoot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StanDaoService
{
    private static int stanCount=5;

    private static List<Stan> stanovi = new ArrayList<>();

    static
    {
        stanovi.add(new Stan(1,"Stan A1",3,156,true));
        stanovi.add(new Stan(2,"Stan A2",2,72,true));
        stanovi.add(new Stan(3,"Stan B1",0,64,false));
        stanovi.add(new Stan(4,"Stan B2",1,104,true));
        stanovi.add(new Stan(5,"Stan C",0,86,false));
    }

    public List<Stan> allFlats()
    {
        return stanovi;
    }

    public Stan findFlat(int id)
    {
        for(Stan stan:stanovi)
        {
            if(stan.getId()==id)
            {
                return stan;
            }
        }
        return null;
    }

    public List<Stan> availableFlats()
    {
        List<Stan> dostupni = new ArrayList<>();
        for(Stan stan:stanovi)
        {
            if(stan.isProdat()==false)
            {
                dostupni.add(stan);
            }
        }
        return dostupni;
    }

    public List<Stan> sortedBySize()
    {
        List<Stan> sorted = new ArrayList<>();
        Stan temp;
        for(int i = 0; i < stanovi.size();i++)
        {
            sorted.add(stanovi.get(i));
        }
        for(int i = 0; i < sorted.size()-1;i++)
        {
            for(int j = 0; j < sorted.size()-1;j++)
            {
                if(sorted.get(j).getKvadratura()>sorted.get(j+1).getKvadratura())
                {
                    temp = sorted.get(j);
                    sorted.set(j,sorted.get(j+1));
                    sorted.set(j+1,temp);
                }
            }
        }
        if(sorted.size()>0)
        {
            return sorted;
        }
        else
        {
            return null;
        }
    }

}

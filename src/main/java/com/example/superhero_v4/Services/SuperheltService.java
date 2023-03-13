package com.example.superhero_v4.Services;

import com.example.superhero_v4.model.Superhelt;
import com.example.superhero_v4.repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SuperheltService {
    private SuperheltRepository repository;

    public SuperheltService(SuperheltRepository superheroes) {
        this.repository = new SuperheltRepository();
    }

    public List<Superhelt> getSuperheroes() {
        return repository.getSuperheroes();
    }

    public Superhelt postSuperheroes(Superhelt superhelt) {
        Superhelt returnSuperhelt = repository.addSuperheroes(superhelt);
        return returnSuperhelt;
    }

    public void getCityByName(String city) {
        Superhelt.getCity();
    }

    public Superhelt putSuperheroes(Superhelt superhelt) {
        superhelt.getHeroName();
        return superhelt;
    }
}

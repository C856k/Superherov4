package com.example.superhero_v4.repositories;

import com.example.superhero_v4.dto.CityHeroDTO;
import com.example.superhero_v4.dto.HeroCountPowerDTO;
import com.example.superhero_v4.model.Superhelt;

import java.util.List;

public interface IRepository_DB {

    Superhelt getSuperheroByName(String heroName);
    List<Superhelt> getAllSuperhero();

    HeroCountPowerDTO getCountPowerByName(String powername);

    List<HeroCountPowerDTO> getAllCountPower();


    CityHeroDTO getCityHeroByName(String City);

    List<CityHeroDTO> getAllCityHero();

}

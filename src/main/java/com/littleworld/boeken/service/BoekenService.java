package com.littleworld.boeken.service;

import com.littleworld.boeken.model.Boeken;
import org.springframework.data.repository.CrudRepository;

public interface BoekenService extends CrudRepository <Boeken, Integer> {

   Iterable<Boeken> findByAuteur(String auteur);
   Iterable<Boeken> findByBeoordeling (int beoordeling);
   Iterable<Boeken> findByTitel(String titel);
}

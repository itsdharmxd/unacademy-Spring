package com.springboot.dharmesh.Dao;

import com.springboot.dharmesh.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LanguageDao  extends JpaRepository<Language,Integer> {
    public Optional<Language> findByLanguageName(String languageName);
}

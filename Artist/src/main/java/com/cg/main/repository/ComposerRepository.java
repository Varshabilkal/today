package com.cg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.entities.Composer;

@Repository
public interface ComposerRepository extends JpaRepository<Composer,Integer>{

	Composer updateComposer(int composer_id, Composer composer);

}

package com.project.AI_Driven.Resume.Keyword.Extractor.repository;

import com.project.AI_Driven.Resume.Keyword.Extractor.entity.ResumeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<ResumeEntity, Long> {
}
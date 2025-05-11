package com.project.AI_Driven.Resume.Keyword.Extractor.controller;


import com.project.AI_Driven.Resume.Keyword.Extractor.model.Resume;
import com.project.AI_Driven.Resume.Keyword.Extractor.service.KeywordExtractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @Autowired
    private KeywordExtractionService keywordExtractionService;

    @PostMapping("/extract")
    public Resume extractKeywords(@RequestBody Resume resume) {
        // Extract keywords from the resume content
        resume.setKeywords(keywordExtractionService.extractKeywords(resume.getContent()));
        return resume;
    }
}
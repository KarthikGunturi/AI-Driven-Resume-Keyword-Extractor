package com.project.AI_Driven.Resume.Keyword.Extractor.model;
import lombok.Data;

import java.util.List;

@Data
public class Resume {
    private String content; // Resume content (raw text)
    private List<String> keywords; // Extracted keywords
}
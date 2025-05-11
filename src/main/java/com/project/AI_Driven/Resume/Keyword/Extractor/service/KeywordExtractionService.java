package com.project.AI_Driven.Resume.Keyword.Extractor.service;

import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.Span;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KeywordExtractionService {

    public List<String> extractKeywords(String content) {
        // Tokenize the resume content (this is a basic method, can be enhanced)
        SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = tokenizer.tokenize(content);

        // Extract possible keywords (e.g., filtering out stopwords, non-relevant words)
        return filterKeywords(tokens);
    }

    private List<String> filterKeywords(String[] tokens) {
        // A basic filter that could be enhanced with NLP or ML models
        List<String> stopwords = List.of("the", "and", "for", "on", "in", "of", "to", "with");

        return List.of(tokens).stream()
                .filter(token -> !stopwords.contains(token.toLowerCase()))
                .collect(Collectors.toList());
    }
}
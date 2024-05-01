package pl.devset.tutorial.services;

import org.springframework.stereotype.Service;

@Service
class TextAnalyzerService {

    int getTextLength(String text) {
        return text.length();
    }
}

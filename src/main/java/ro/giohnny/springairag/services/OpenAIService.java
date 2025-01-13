package ro.giohnny.springairag.services;

import ro.giohnny.springairag.model.Answer;
import ro.giohnny.springairag.model.Question;

public interface OpenAIService {
    Answer getAnswer(Question question);
}

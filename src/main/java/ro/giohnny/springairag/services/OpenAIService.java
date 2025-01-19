package ro.giohnny.springairag.services;

import org.springframework.stereotype.Service;
import ro.giohnny.springairag.model.Answer;
import ro.giohnny.springairag.model.Question;

@Service
public interface OpenAIService {

    Answer getAnswer(Question question);
}

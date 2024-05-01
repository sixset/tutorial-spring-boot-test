package pl.devset.tutorial.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TextAnalyzerServiceTest {

    @Autowired
    private TextAnalyzerService toTest;


    @Test
    public void should_return_correct_test_length() {

        //given
        String textOne = "Hello World";
        String textTwo = "";
        String textThree = "!@#123";

        //when
        int responseOne = toTest.getTextLength(textOne);
        int responseTwo = toTest.getTextLength(textTwo);
        int responseThree = toTest.getTextLength(textThree);

        //then
        assertEquals(11, responseOne);
        assertEquals(0, responseTwo);
        assertEquals(6, responseThree);
    }

}

package com.ece.superkids.testing;

import com.ece.superkids.QuestionDatabase;
import com.ece.superkids.QuestionDatabaseFactory;
import com.ece.superkids.builders.QuestionBuilder;
import com.ece.superkids.entities.Question;
import com.ece.superkids.enums.QuestionCategory;
import com.ece.superkids.enums.QuestionLevel;
import com.ece.superkids.enums.QuestionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QuestionDatabaseTests {

    QuestionDatabase questionDatabase;
    private Question expected;

    @Before
    public void setup() {
        questionDatabase = QuestionDatabaseFactory.aQuestionDatabaseWithAllQuestions();
        expected = QuestionBuilder.aQuestion()
                .asking("What has four sides?")
                .ofType(QuestionType.TEXT)
                .withChoices("Square", "Circle", "Triangle", "Oval")
                .withAnswer("Square")
                .withExplaination("A square has four equal sides")
                .ofLevel(QuestionLevel.LEVEL_1)
                .inCategory(QuestionCategory.SHAPES)
                .build();
    }



    @Test
    public void questionsAreParsedCorrectly() {
        Question question = questionDatabase.getQuestion(QuestionLevel.LEVEL_1, QuestionCategory.SHAPES, 0);
        assertEquals(expected, question);
    }

    @Test
    public void questionIndexOutOfBoundsReturnsNull() {
        int numberOfQuestions = questionDatabase.getNumberOfQuestions(QuestionLevel.LEVEL_1, QuestionCategory.SHAPES);
        assertNull(questionDatabase.getQuestion(QuestionLevel.LEVEL_1, QuestionCategory.SHAPES,
                numberOfQuestions + 1));
    }
}

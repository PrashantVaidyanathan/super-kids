/**
 * @author M4rc Adam
 */
package com.ece.superkids.testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertEquals;

import com.ece.superkids.questions.entities.*;
import com.ece.superkids.questions.enums.*;

import com.ece.superkids.users.FileUserManager;
import com.ece.superkids.users.entities.History;
import com.ece.superkids.users.entities.User;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateSavedTests {
    
    private FileUserManager fileUserManager = new FileUserManager();
    private User testUser;
    private Question question;
    
    @Before
    public void setup() {
        testUser = new User("TestUser");
        question = new Question();
        
        question.setAnswer("QuestionAnswer");
        question.setCategory(QuestionCategory.ANIMALS);
        question.setLevel(QuestionLevel.LEVEL_1);
        question.setExplaination("This is a test question, do not answer this.");
        question.setType(QuestionType.TEXT);
        ArrayList choices = new ArrayList();
        choices.add("Answer 1");
        choices.add("Answer 2");
        choices.add("Answer 3");
        choices.add("Answer 4");
        question.setChoices(choices);
    }

    @Test
    public void setCurrentQuestionTest() {
        testUser.setCurrentQuestion(question);
        testUser.saveUser();
    }
    
    @Test 
    public void getStateAfterClosingApplicationTest() {
         User actualUser = fileUserManager.getUser("TestUser");
        Question actualQuestion = actualUser.getState().getCurrentQuestion();

        assertEquals(question.getQuestion(), actualQuestion.getQuestion());
        assertEquals(question.getExplaination(), actualQuestion.getExplaination());
        
        fileUserManager.deleteUser("TestUser");
    }





}

/**
 * @author M4rc Adam
 */
package com.ece.superkids.users.entities;

import com.ece.superkids.questions.entities.Question;
import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.questions.enums.QuestionCategory;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.io.Serializable;

public class History implements Serializable {

    private Map<String, ArrayList<State>> questionToList;
    private boolean gameStarted;

    private static Map<QuestionLevel, ArrayList<QuestionCategory>> levelToCategories;
    
    /* whenever new categories are added these lists need to be updated, else the history won't be able to know if the user is done with the level */
    private QuestionCategory level1Categories[] = {QuestionCategory.SHAPES, QuestionCategory.COLORS, QuestionCategory.ANIMALS};
    private QuestionCategory level2Categories[] = {QuestionCategory.FOOD, QuestionCategory.GEOGRAPHY, QuestionCategory.PLANETS};
    private QuestionCategory level3Categories[] = {QuestionCategory.STATIONARY, QuestionCategory.INSTRUMENTS, QuestionCategory.BODYPARTS};
    
    /* whenever new levels are added this needs to be updated, else the history won't be able to know if the user is done with the game */
    private QuestionLevel gameLevels[] = {QuestionLevel.LEVEL_1, QuestionLevel.LEVEL_2, QuestionLevel.LEVEL_3};

    
    private void init() {
        levelToCategories = new HashMap<QuestionLevel, ArrayList<QuestionCategory>>();
        levelToCategories.put(QuestionLevel.LEVEL_1, new ArrayList<QuestionCategory>(Arrays.asList(level1Categories)));
        levelToCategories.put(QuestionLevel.LEVEL_2, new ArrayList<QuestionCategory>(Arrays.asList(level2Categories)));
        levelToCategories.put(QuestionLevel.LEVEL_3, new ArrayList<QuestionCategory>(Arrays.asList(level3Categories)));
    }

    public History() {
        questionToList = new HashMap();
        gameStarted = false;
        init();
    }

    public void setGameStarted() {
        gameStarted = true;
    }
    public boolean getGameStarted() {
        return gameStarted;
    }

    /* use this function to see if you wanna show 'continue game' button or not */
    public boolean getGameOn() {
        return (gameStarted && !isGameFinished());
    }

    /* call this to see if the level is finished */
     public boolean isLevelFinished(QuestionLevel level) {
         ArrayList<QuestionCategory> questionCategoryList = levelToCategories.get(level);
         for(int i=0; i<questionCategoryList.size(); i++) {
             String key = questionCategoryList.get(i) + ":" + level;
             if(!questionToList.containsKey(key)) {
                 return false;
             }
         }
        return true;
    }

     /* call to see if the game is finished */
     public boolean isGameFinished() {
         ArrayList<QuestionLevel> gameLevelsList = new ArrayList<QuestionLevel>(Arrays.asList(gameLevels));
         for(int i=0; i<gameLevelsList.size(); i++) {
             if(!isLevelFinished(gameLevelsList.get(i))) {
                 return false;
             }
         }
         return true;
     }

    public void saveToHistory(State state) {
        QuestionCategory category = state.getCurrentCategory();
        QuestionLevel level = state.getCurrentLevel();
        String key = category.toString() + ":" + level.toString();
        if(questionToList.containsKey(key)) {
            ArrayList<State> states = (ArrayList<State>)questionToList.get(key);
            if(states.size()==5) {
                states.remove(0);
            }
            states.add(state);
        } else {
            ArrayList<State> states = new ArrayList();
            states.add(state);
            questionToList.put(key, states);
        }
    }
    
    public Map<Question, ArrayList<Integer>> getHistoryMap(QuestionCategory category, QuestionLevel level) {
        String key = category.toString() + ":" + level.toString();
        Map<Question, ArrayList<Integer>> questionToScores = new HashMap();
        if(questionToList.containsKey(key)) {
            ArrayList<State> states = (ArrayList<State>)questionToList.get(key);
            for(int i=0; i<states.size(); i++) {
                Iterator it = states.get(i).getAllScores().entrySet().iterator();
                while(it.hasNext()) {
                    Map.Entry pairs = (Map.Entry)it.next();
                    Question questionKey = (Question)pairs.getKey();

                    if(questionToScores.containsKey(questionKey)) {

                        ArrayList<Integer> listOfScores = (ArrayList<Integer>)questionToScores.get(questionKey);
                        listOfScores.add((Integer)pairs.getValue());
                        questionToScores.put(questionKey, listOfScores);
                    } else {
                        ArrayList<Integer> listOfScores = new ArrayList();
                        listOfScores.add((Integer)pairs.getValue());
                        questionToScores.put(questionKey, listOfScores);
                    }
                }
            }
            return questionToScores;
            
        } else {
            return null;
        }
    }
    
    public Object[][] getHistory(QuestionCategory category, QuestionLevel level) {
        Map<Question, ArrayList<Integer>> map = this.getHistoryMap(category, level);
        if(map.size()!=0) {
            Iterator it = map.entrySet().iterator();
            int counter = 0;
            while(it.hasNext())  {
                Map.Entry pairs = (Map.Entry)it.next();
                counter ++;
            }
            Object o[][] = new Object[counter][6];
            it = map.entrySet().iterator();
            int index = 0;
            while(it.hasNext()) {
                Map.Entry pairs = (Map.Entry)it.next();
                ArrayList<Integer> scoresList = (ArrayList<Integer>)pairs.getValue();
                o[index][0] = ((Question)pairs.getKey()).getQuestion();
                for(int i=1; i<scoresList.size()+1; i++) {
                    o[index][i] = scoresList.get(i-1);
                }
                index++;
            }
            return o;
        } else {
            return null;
        }

    }
    
    public Object[][] getHistoryTest() {
        Object o[][] = new Object[10][6];
        for(int i=0; i<o.length; i++) {
            o[i][0] = "Question" + i;
            for(int j=1; j<6; j++) {
                o[i][j] = i*i;
            }
        }
        return o;
    }


}

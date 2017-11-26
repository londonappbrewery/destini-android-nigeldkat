package com.londonappbrewery.destini;

/**
 * Created by vogelr on 11/26/2017.
 */

public class StoryStepInfo {
    private int QuestionId;
    private int Answer1Id;
    private int Answer2Id;
    private boolean Is1End;
    private boolean Is2End;
    private int NextIndex1;
    private int NextIndex2;

    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int questionId) {
        QuestionId = questionId;
    }

    public int getAnswer1Id() {
        return Answer1Id;
    }

    public void setAnswer1Id(int answer1Id) {
        Answer1Id = answer1Id;
    }

    public int getAnswer2Id() {
        return Answer2Id;
    }

    public void setAnswer2Id(int answer2Id) {
        Answer2Id = answer2Id;
    }

    public boolean isIs1End() {
        return Is1End;
    }

    public void setIs1End(boolean is1End) {
        Is1End = is1End;
    }

    public boolean isIs2End() {
        return Is2End;
    }

    public void setIs2End(boolean is2End) {
        Is2End = is2End;
    }

    public int getNextIndex1() {
        return NextIndex1;
    }

    public void setNextIndex1(int nextIndex1) {
        NextIndex1 = nextIndex1;
    }

    public int getNextIndex2() {
        return NextIndex2;
    }

    public void setNextIndex2(int nextIndex2) {
        NextIndex2 = nextIndex2;
    }

    public StoryStepInfo(int questionId, int answer1Id, int answer2Id, boolean is1End, boolean is2End,
                         int nextIndex1, int nextIndex2){
        QuestionId = questionId;
        Answer1Id = answer1Id;
        Answer2Id = answer2Id;
        Is1End = is1End;
        Is2End = is2End;
        NextIndex1 = nextIndex1;
        NextIndex2 = nextIndex2;
    }
}

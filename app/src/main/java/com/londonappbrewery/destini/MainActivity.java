package com.londonappbrewery.destini;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonTop;
    Button mButtonBottom;
    TextView mTextViewStory;
    int mIndex;

    StoryStepInfo[] mSteps = new StoryStepInfo[] {
        new StoryStepInfo(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, false,false,
                2,1),
            new StoryStepInfo(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, false,true,
                    2,0),
            new StoryStepInfo(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, true,true,
                    2,1),
    };

    int[] mEndings = new int[] {
      R.string.T4_End, R.string.T5_End, R.string.T6_End
    };

    // new TrueFalse(R.string.question_1, true),

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mTextViewStory = (TextView) findViewById(R.id.storyTextView);

        DisplayNext(0,false);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNext(mSteps[mIndex].getNextIndex1(), mSteps[mIndex].isIs1End());
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNext(mSteps[mIndex].getNextIndex2(), mSteps[mIndex].isIs2End());
            }
        });

    }

    private void DisplayNext(int next, boolean isEnd){
        if(isEnd == true){
            mButtonTop.setVisibility(View.INVISIBLE);
            mButtonBottom.setVisibility(View.INVISIBLE);
            mTextViewStory.setText(mEndings[next]);
            mIndex = 0;
        } else {
            mButtonTop.setText(mSteps[next].getAnswer1Id());
            mButtonBottom.setText(mSteps[next].getAnswer2Id());
            mTextViewStory.setText(mSteps[next].getQuestionId());
            mIndex = next;
        }
    }
}

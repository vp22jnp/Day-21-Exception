package com.UserRegistration;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



public class MoodAnalyzerTest  {

    @Test
    public void givenmessage_whenSadshouldreturn_sad() throws Exception {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("i am in sad mood");
        String mood=moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void givenmessage_whenHappy_shouldreturn_Happy() throws Exception {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("i am in happy mood");
        String mood=moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenmessage_whenNull_should_ThrowMoodAnalyzerNullException() throws Exception {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("NULL");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.Exceptiontype.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenmessage_whenEmpty_should_ThrowMoodAnalyserEmptyException () {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.Exceptiontype.ENTERED_EMPTY, e.type);
        }
    }
}

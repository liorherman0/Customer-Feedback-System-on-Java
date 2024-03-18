package com.feedbacksystem;

import com.feedbacksystem.model.Feedback;
import com.feedbacksystem.model.FeedbackType;

import java.util.ArrayList;
import java.util.List;

public class FeedbackSystem {
    private List<Feedback> feedbackList;

    public FeedbackSystem() {
        feedbackList = new ArrayList<>();
    }

    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return feedbackList;
    }

    public List<Feedback> getFeedbackByType(FeedbackType type) {
        List<Feedback> filteredFeedback = new ArrayList<>();
        for (Feedback feedback : feedbackList) {
            if (feedback.getType() == type) {
                filteredFeedback.add(feedback);
            }
        }
        return filteredFeedback;
    }
}

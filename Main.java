package com.feedbacksystem;

import com.feedbacksystem.model.Feedback;
import com.feedbacksystem.model.FeedbackType;

public class Main {
    public static void main(String[] args) {
        FeedbackSystem feedbackSystem = new FeedbackSystem();

        // Adding sample feedback
        feedbackSystem.addFeedback(new Feedback("John Doe", FeedbackType.COMPLAINT, "Product was damaged upon delivery."));
        feedbackSystem.addFeedback(new Feedback("Jane Smith", FeedbackType.SUGGESTION, "Add more payment options."));
        feedbackSystem.addFeedback(new Feedback("Alice Johnson", FeedbackType.COMPLIMENT, "Great customer service!"));

        // Displaying all feedback
        System.out.println("All Feedback:");
        feedbackSystem.getAllFeedback().forEach(Main::displayFeedback);

        // Displaying complaints only
        System.out.println("\nComplaints:");
        feedbackSystem.getFeedbackByType(FeedbackType.COMPLAINT).forEach(Main::displayFeedback);
    }

    private static void displayFeedback(Feedback feedback) {
        System.out.println("Customer: " + feedback.getCustomerName());
        System.out.println("Type: " + feedback.getType());
        System.out.println("Message: " + feedback.getMessage());
        System.out.println("Timestamp: " + feedback.getTimestamp());
        System.out.println();
    }
}

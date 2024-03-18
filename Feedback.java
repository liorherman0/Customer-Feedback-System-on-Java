package com.feedbacksystem.model;

import java.time.LocalDateTime;

public class Feedback {
    private String customerName;
    private FeedbackType type;
    private String message;
    private LocalDateTime timestamp;

    public Feedback(String customerName, FeedbackType type, String message) {
        this.customerName = customerName;
        this.type = type;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getCustomerName() {
        return customerName;
    }

    public FeedbackType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}

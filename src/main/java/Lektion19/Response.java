package Lektion19;

import java.io.Serializable;

public class Response implements Serializable {
    private String message;
    private boolean finished;
    private boolean correct;

    public Response(String message, boolean finished, boolean correct) {
        this.message = message;
        this.finished = finished;
        this.correct = correct;
    }

    public String getMessage() {
        return message;
    }

    public boolean isFinished() {
        return finished;
    }

    public boolean isCorrect() {
        return correct;
    }
}

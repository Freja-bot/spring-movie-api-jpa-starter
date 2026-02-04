package ek.osnb.starter.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Rating {

    private double score;
    private Integer voteCount;

    public Rating() {
    }

    public Rating(double score, Integer voteCount) {
        this.score = score;
        this.voteCount = voteCount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}

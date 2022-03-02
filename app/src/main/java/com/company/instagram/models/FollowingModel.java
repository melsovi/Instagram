package com.company.instagram.models;

public class FollowingModel {
    private int userImg, post_img;
    private String commentText;

    public FollowingModel(int userImg, int post_img, String commentText) {
        this.userImg = userImg;
        this.post_img = post_img;
        this.commentText = commentText;
    }

    public int getUserImg() {
        return userImg;
    }

    public int getPost_img() {
        return post_img;
    }

    public String getCommentText() {
        return commentText;
    }
}

package com.example.the.algorithm.data;

/**
 * Created by the on 2017-08-11.
 */

public class ChattingData {


    // 내가 보냈는지, 컴퓨터가 보냈는지
    private boolean isSentByMe;
    // 메세지 내용 저장
    private String messageText;

    public ChattingData() {
    }

    public ChattingData(boolean isSentByMe, String messageText) {

        this.isSentByMe = isSentByMe;

        this.messageText = messageText;
    }

    public boolean isSentByme() {

        return isSentByMe;
    }

    public void setSentByme(boolean sentByme) {
        isSentByMe = sentByme;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}

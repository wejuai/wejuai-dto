package com.wejuai.dto.response;

/**
 * @author ZM.Wang
 */
public class MchTradeResponse {

    private boolean status;

    private String channelTradeId;

    private String mchTradeRecordId;

    public MchTradeResponse(boolean status, String channelTradeId, String mchTradeRecordId) {
        this.status = status;
        this.channelTradeId = channelTradeId;
        this.mchTradeRecordId = mchTradeRecordId;
    }

    MchTradeResponse() {
    }

    public boolean getStatus() {
        return status;
    }

    public String getChannelTradeId() {
        return channelTradeId;
    }

    public String getMchTradeRecordId() {
        return mchTradeRecordId;
    }
}

package com.example.myapplication;

public class RoomBean {

    /**
     * message : {"audioUrl":"http://v-rtmp-ngb.qf.56.com/live/520009_1545088444511?only-audio=1&wsSecret=cb584e989bf5e09e6e106f7b8a27046e&wsTime=5C184D35&cid=1&ver=ngb&cip=ngb&get_url=6","sp":2,"hd":3,"rUrl":"http://v-ngb.qf.56.com/live/520009_1545088444511.flv?wsSecret=cb584e989bf5e09e6e106f7b8a27046e&wsTime=5C184D35&cid=1&ver=ngb&cip=ngb&get_url=9","push":1,"live":1}
     * status : 200
     */

    private MessageBean message;
    private int status;

    public MessageBean getMessage() {
        return message;
    }

    public void setMessage(MessageBean message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class MessageBean {
        /**
         * audioUrl : http://v-rtmp-ngb.qf.56.com/live/520009_1545088444511?only-audio=1&wsSecret=cb584e989bf5e09e6e106f7b8a27046e&wsTime=5C184D35&cid=1&ver=ngb&cip=ngb&get_url=6
         * sp : 2
         * hd : 3
         * rUrl : http://v-ngb.qf.56.com/live/520009_1545088444511.flv?wsSecret=cb584e989bf5e09e6e106f7b8a27046e&wsTime=5C184D35&cid=1&ver=ngb&cip=ngb&get_url=9
         * push : 1
         * live : 1
         */

        private String audioUrl;
        private int sp;
        private int hd;
        private String rUrl;
        private int push;
        private int live;

        public String getAudioUrl() {
            return audioUrl;
        }

        public void setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
        }

        public int getSp() {
            return sp;
        }

        public void setSp(int sp) {
            this.sp = sp;
        }

        public int getHd() {
            return hd;
        }

        public void setHd(int hd) {
            this.hd = hd;
        }

        public String getRUrl() {
            return rUrl;
        }

        public void setRUrl(String rUrl) {
            this.rUrl = rUrl;
        }

        public int getPush() {
            return push;
        }

        public void setPush(int push) {
            this.push = push;
        }

        public int getLive() {
            return live;
        }

        public void setLive(int live) {
            this.live = live;
        }
    }
}

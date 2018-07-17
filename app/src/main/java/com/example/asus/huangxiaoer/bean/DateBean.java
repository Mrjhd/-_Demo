package com.example.asus.huangxiaoer.bean;

/**
 * Created by 因为有个你i on 2018/7/13.
 */

public class DateBean {
    /**
     * success : true
     * msg : 检查到新的版本
     * data : {"last_version":5,"last_must_update":3,"url":"http://www.xieast.com/api/new_version.apk","md5":"8a7e66aa24db642af2afbff7b6b1f359"}
     */

    private boolean success;
    private String msg;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * last_version : 5
         * last_must_update : 3
         * url : http://www.xieast.com/api/new_version.apk
         * md5 : 8a7e66aa24db642af2afbff7b6b1f359
         */

        private int last_version;
        private int last_must_update;
        private String url;
        private String md5;

        public int getLast_version() {
            return last_version;
        }

        public void setLast_version(int last_version) {
            this.last_version = last_version;
        }

        public int getLast_must_update() {
            return last_must_update;
        }

        public void setLast_must_update(int last_must_update) {
            this.last_must_update = last_must_update;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }
    }
}

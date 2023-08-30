package com.gusgluna.timestampmicroservicespringboot.Collection;

public class DateApi {
    Long unix;
    String utc;


    public Long getUnix() {
        return unix;
    }

    public void setUnix(Long unix) {
        this.unix = unix;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }

    @Override
    public String toString() {
        return "Date{" +
                "unix='" + unix + '\'' +
                ", utc='" + utc + '\'' +
                '}';
    }


    public DateApi(Long unix, String utc) {
        this.unix = unix;
        this.utc = utc;
    }
}

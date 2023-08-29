package com.gusgluna.timestampmicroservicespringboot.Collection;

public class DateApi {
    String unix;
    String utc;


    public String getUnix() {
        return unix;
    }

    public void setUnix(String unix) {
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


    public DateApi(String unix, String utc) {
        this.unix = unix;
        this.utc = utc;
    }
}

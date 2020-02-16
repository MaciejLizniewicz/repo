package com.masiblue.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "USABILITY_DATA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsabilityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="IP")
    private String ip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserMeasurementNumber() {
        return userMeasurementNumber;
    }

    public void setUserMeasurementNumber(int userMeasurementNumber) {
        this.userMeasurementNumber = userMeasurementNumber;
    }

    public long getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(long saveTime) {
        this.saveTime = saveTime;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getMouseClicks() {
        return mouseClicks;
    }

    public void setMouseClicks(int mouseClicks) {
        this.mouseClicks = mouseClicks;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public int getIsFailed() {
        return isFailed;
    }

    public void setIsFailed(int isFailed) {
        this.isFailed = isFailed;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Column(name="BROWSER")
    @Enumerated(value = EnumType.STRING)
    private Browser browser;

    @Column(name="USERNAME")
    private String username;

    @Column(name="M_ID")
    private int userMeasurementNumber;

    @Column(name="SAVETIME")
    private long saveTime;

    @Column(name="RES_W")
    private int screenWidth;

    @Column(name="RES_H")
    private int screenHeight;

    @Column(name="MC")
    private int mouseClicks;

    @Column(name="TIME")
    private long time;

    @Column(name="DIST")
    private long distance;

    @Column(name="FAIL")
    private int isFailed = 0;

    @Column(name="ERROR")
    private int errorCode;
}

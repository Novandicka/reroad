package com.reroad.reroad.fp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("ID_USER")
    @Expose
    private Integer id_user;


    @SerializedName("USERNAME")
    @Expose
    private String username;

    @SerializedName("EMAIL")
    @Expose
    private String email;

    @SerializedName("NO_TELP")
    @Expose
    private String no_telp;

    @SerializedName("PASSWORD")
    @Expose
    private String password;

    @SerializedName("PHOTO")
    @Expose
    private String photo;

    @SerializedName("ACTIVATED")
    @Expose
    private Integer activated;

    @SerializedName("CREATED")
    @Expose
    private String created;

    @SerializedName("GROUP_USER")
    @Expose
    private Integer group_user;

    @SerializedName("LAST_LOGIN")
    @Expose
    private String last_logn;

    @SerializedName("LAST_UPDATE")
    @Expose
    private String last_update;

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getGroup_user() {
        return group_user;
    }

    public void setGroup_user(Integer group_user) {
        this.group_user = group_user;
    }

    public String getLast_logn() {
        return last_logn;
    }

    public void setLast_logn(String last_logn) {
        this.last_logn = last_logn;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

package com.lib.bibliosoft.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: 毛文杰
 * @Description:
 * @Date: Created in 3:23 PM. 9/29/2018
 * @Modify By:
 */
@Entity
@Table(name="reader")
public class Reader implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "reader_id")
    private String readerId;

    private String phone;

    private String email;

    private String readerName;

    private String password;

    private String sex;

    private String imgsrc;

    private String status;

    private Integer alldebt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registTime;

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private List<Comment> commentList;

    @OneToMany(mappedBy = "reader",fetch = FetchType.EAGER)
    private List<Feedback> feedbackList;

    public Reader() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

//    public List<Comment> getCommentList() {
//        return commentList;
//    }
//
//    public void setCommentList(List<Comment> commentList) {
//        this.commentList = commentList;
//    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public Integer getAlldebt() {
        return alldebt;
    }

    public void setAlldebt(Integer alldebt) {
        this.alldebt = alldebt;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srsoftwares.studrecmgmt.data;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * File Name - StudentRecord.java
 * Author - Sumit Roy
 * Created On - May 09, 2013, 12:11:57 PM
 * Project - Student Records Management
 * Developed By - SR Softwares
 * Visit Us at - http:://www.srsoftwares.co.nr
 *
 */

@XmlRootElement
public class StudentRecord {
String studentName;
String studentClass;
String studentID;
String studentInstitution;
String studentBatchName;
String studentCourse;
String studentSubjectDetails;

    public StudentRecord() {
    studentBatchName="N/A";
    studentClass="N/A";
    studentCourse="N/A";
    studentID="N/A";
    studentInstitution="N/A";
    studentName="N/A";
    studentSubjectDetails="N/A";  
    }

    public String getStudentName() {
        return studentName;
    }

    @XmlElement
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    @XmlElement
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentID() {
        return studentID;
    }
    
    @XmlAttribute
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentInstitution() {
        return studentInstitution;
    }

    @XmlElement
    public void setStudentInstitution(String studentInstitution) {
        this.studentInstitution = studentInstitution;
    }

    public String getStudentBatchName() {
        return studentBatchName;
    }

    @XmlElement
    public void setStudentBatchName(String studentBatchName) {
        this.studentBatchName = studentBatchName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    @XmlElement
    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentSubjectDetails() {
        return studentSubjectDetails;
    }

    @XmlElement
    public void setStudentSubjectDetails(String studentSubjectDetails) {
        this.studentSubjectDetails = studentSubjectDetails;
    }

    

   

    @Override
    public String toString() {
        String msg="\n Name : "+getStudentName()+"\n ID : "+getStudentID();
        return msg;
    }
    
    
}

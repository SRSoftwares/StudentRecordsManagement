/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsoftwares.studrecmgmt.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * File Name - StudentRecordList.java
 * Author - Sumit Roy
 * Created On - May 09, 2013, 12:11:57 PM
 * Project - Student Records Management
 * Developed By - SR Softwares
 * Visit Us at - http:://www.srsoftwares.co.nr
 *
 */
@XmlRootElement
public class StudentRecordList {

    private List<StudentRecord> studentRecordList = null;

    public StudentRecordList() {
        studentRecordList = new ArrayList<StudentRecord>();
    }

    public void addRecordsToList(StudentRecord studentRecord) {
        if (studentRecordList == null) {
            studentRecordList = new ArrayList<StudentRecord>();
        }
        studentRecordList.add(studentRecord);
    }

    public boolean removeRecordFromList(StudentRecord studentRecord) {
        boolean status=false;
        if (studentRecordList != null) {
            if (studentRecordList.contains(studentRecord)) {
                studentRecordList.remove(studentRecord);
                status=true;
            }
        }
        return status;
    }

    public List<StudentRecord> getStudentRecordList() {
        return studentRecordList;
    }

    @XmlElement
    public void setStudentRecordList(List<StudentRecord> studentRecordList) {
        this.studentRecordList = studentRecordList;
    }
    
    
}

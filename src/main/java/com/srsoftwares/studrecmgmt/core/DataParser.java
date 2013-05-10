/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsoftwares.studrecmgmt.core;

import com.srsoftwares.studrecmgmt.data.StudentRecord;
import com.srsoftwares.studrecmgmt.data.StudentRecordList;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * File Name - DataParser.java
 * Author - Sumit Roy
 * Created On - May 09, 2013, 12:11:57 PM
 * Project - Student Records Management
 * Developed By - SR Softwares
 * Visit Us at - http:://www.srsoftwares.co.nr
 *
 */

public class DataParser {

    private String filePath;
    private String fileName;
    private String fileExtension;
    private StringBuilder completeFileName;
    private static DataParser dataParser = null;
    private JAXBContext jAXBContext;
    private Marshaller jaxbMarshaller;
    private File file;
    private static final Logger logger = LoggerFactory.getLogger(DataParser.class);

    public DataParser() {
        filePath = System.getProperty("user.dir")
                + System.getProperty("file.separator") + "data"
                + System.getProperty("file.separator");
        fileName = "Student Records Details";
        fileExtension = ".xml";
        completeFileName = new StringBuilder();
        completeFileName.append(filePath).append(fileName).append(fileExtension);
        file = new File(completeFileName.toString());

    }

    public static DataParser getInstance() {
        if (dataParser == null) {
            dataParser = new DataParser();
        }
        return dataParser;
    }

    public void addStudentRecordsToData(StudentRecordList studnetRecordList) throws JAXBException {

        jAXBContext = JAXBContext.newInstance(StudentRecordList.class);
        jaxbMarshaller = jAXBContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(studnetRecordList, file);
        jaxbMarshaller.marshal(studnetRecordList, System.out);
        
    }
}

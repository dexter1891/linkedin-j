//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.08 at 03:49:38 PM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Education;
import com.google.code.linkedinapi.schema.Educations;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "education"
})
@XmlRootElement(name = "educations")
public class EducationsImpl
    implements Educations
{

    @XmlElement(required = true, type = EducationImpl.class)
    protected EducationImpl education;
    @XmlAttribute(required = true)
    protected BigInteger total;

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education value) {
        this.education = ((EducationImpl) value);
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger value) {
        this.total = value;
    }

}
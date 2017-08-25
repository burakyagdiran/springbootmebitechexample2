package com.burakyagdiran2.Entity;

public class Meeting {

    private int m_id;
    private String m_name;
    private String m_description;
    private String m_department;

    public Meeting(int m_id , String m_name , String m_description, String m_department){

        this.m_id=m_id;
        this.m_name=m_name;
        this.m_description=m_description;
        this.m_department=m_department;
    }

    public Meeting(){}

    public int getM_id() { return m_id; }

    public void setM_id(int m_id) { this.m_id = m_id; }

    public String getM_department() { return m_department; }

    public void setM_department(String m_department) { this.m_department = m_department; }

    public String getM_name() { return m_name; }

    public void setM_name(String m_name) { this.m_name = m_name; }

    public String getM_description() { return m_description; }

    public void setM_description(String m_description) { this.m_description = m_description; }
}

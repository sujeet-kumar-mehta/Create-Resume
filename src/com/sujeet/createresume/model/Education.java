package com.sujeet.createresume.model;

public class Education {
  
  String course,institute,startDate,endDate,otherInfo,id;

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @param course
   * @param institute
   * @param startDate
   * @param endDate
   * @param otherInfo
   * @param id
   */
  public Education(String course, String institute, String startDate, String endDate,
      String otherInfo, String id) {
    super();
    this.course = course;
    this.institute = institute;
    this.startDate = startDate;
    this.endDate = endDate;
    this.otherInfo = otherInfo;
    this.id = id;
  }

  /**
   * @return the course
   */
  public String getCourse() {
    return course;
  }

  public Education(String course, String institute, String startDate, String endDate,
      String otherInfo) {
    super();
    this.course = course;
    this.institute = institute;
    this.startDate = startDate;
    this.endDate = endDate;
    this.otherInfo = otherInfo;
  }

  /**
   * @param course the course to set
   */
  public void setCourse(String course) {
    this.course = course;
  }

  /**
   * @return the institute
   */
  public String getInstitute() {
    return institute;
  }

  /**
   * @param institute the institute to set
   */
  public void setInstitute(String institute) {
    this.institute = institute;
  }

  /**
   * @return the startDate
   */
  public String getStartDate() {
    return startDate;
  }

  /**
   * @param startDate the startDate to set
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * @return the endDate
   */
  public String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate the endDate to set
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * @return the otherInfo
   */
  public String getOtherInfo() {
    return otherInfo;
  }

  /**
   * @param otherInfo the otherInfo to set
   */
  public void setOtherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
  }
  

}

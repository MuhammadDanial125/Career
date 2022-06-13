package com.example.career;

public class homeClass {

    private int Id;
    private int imageCourse;
    private String courseTitle;

    public homeClass(int id, int imageCourse, String courseTitle) {
        Id = id;
        this.imageCourse = imageCourse;
        this.courseTitle = courseTitle;
    }

    public homeClass() {
    }

    public homeClass(int imageCourse, String courseTitle) {
        this.imageCourse = imageCourse;
        this.courseTitle = courseTitle;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImageCourse() {
        return imageCourse;
    }

    public void setImageCourse(int imageCourse) {
        this.imageCourse = imageCourse;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    @Override()
    public boolean equals(Object other) {
        // This is unavoidable, since equals() must accept an Object and not something more derived
        if (other instanceof homeClass) {
            /* Note that I use equals() here too, otherwise, again, we will check for referential equality.
             Using equals() here allows the Model class to implement it's own version of equality, rather than
             us always checking for referential equality.*/
            homeClass homeClass = (homeClass) other;
            return homeClass.getId() == (this.getId());
        }

        return false;
    }

}


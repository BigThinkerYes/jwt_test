package com.lavorwebtokens.service;


import com.lavorwebtokens.model.Course;
import java.util.List;

public interface CourseService
    {
        List<Course> all();

        void save( Course course );

        void delete( String courseId );
    }



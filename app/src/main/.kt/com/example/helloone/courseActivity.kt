package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*

class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)


        val courseList = ArrayList<Course>()

        courseList.add(Course(1, "python", 1001, "susan", "A new language for Android"))
        courseList.add(Course(2, "Java", 1002, "talaso", "An old language for Android"))
        courseList.add(Course(3, "kotlin", 1003, "lenguya", "A hyper Language"))


        val adapter = CourseRecyclerViewAdapter(courseList)

        course_recyclerview.layoutManager = LinearLayoutManager(this)
        course_recyclerview.adapter = adapter
    }
}
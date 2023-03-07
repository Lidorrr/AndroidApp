package com.example.adnroidProject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.adnroidProject.model.Model;
import com.example.adnroidProject.model.Student;

import java.util.List;

public class StudentsListFragmentViewModel extends ViewModel {
    private LiveData<List<Student>> data = Model.instance().getAllStudents();

    LiveData<List<Student>> getData(){
        return data;
    }
}

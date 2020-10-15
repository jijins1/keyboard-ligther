package com.github.jijins1.keyboardligther.services

import com.intellij.openapi.project.Project
import com.github.jijins1.keyboardligther.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

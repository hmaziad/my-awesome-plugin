package com.github.hmaziad.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.hmaziad.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.jackkoenig.intellijplatformplugintemplateexperiment.services

import com.intellij.openapi.project.Project
import com.github.jackkoenig.intellijplatformplugintemplateexperiment.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

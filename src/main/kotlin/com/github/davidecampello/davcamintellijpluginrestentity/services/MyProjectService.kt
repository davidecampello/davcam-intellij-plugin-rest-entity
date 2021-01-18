package com.github.davidecampello.davcamintellijpluginrestentity.services

import com.github.davidecampello.davcamintellijpluginrestentity.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

import hudson.model.*
import org.jenkinsci.plugins.workflow.job.WorkflowJob
import org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition

// Получаем экземпляр Jenkins
def instance = Jenkins.getInstance()

// Название задания
String jobName = "MyFirstPipeline"

// Определяем содержимое нашей Pipeline
String pipelineScript = """
node {
     stage('Hello') {
        echo 'Привет от Jenkins!'
     }
}
"""

// Создаем новое задание типа WorkflowJob
WorkflowJob newJob = instance.createProject(WorkflowJob.class, jobName)
newJob.setDefinition(new CpsFlowDefinition(pipelineScript, true))

// Сохраняем изменения
instance.save()

println("Задание ${jobName} создано.")
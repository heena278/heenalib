def newgit(repo)
{
  git "https://github.com/heena278/${repo}.git"
}

def newmaven()
{
 sh 'mvn package'
}

def newdeploy(jobname,ip,context)
{
sh "scp  /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def newselenium(jobname)
{
sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}

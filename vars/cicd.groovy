def newgit(repo)
{
  git "https://github.com/heena278/${repo}.git"
}

def newmaven()
{
 sh 'mvn package'
}

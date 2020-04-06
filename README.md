1. Create a new git branch in the working directory
```bash
git branch week1
git checkout week1
```

2. Initalise the project by running the following maven command
```bash
mvn archetype:generate -DgroupId=com.invictalabs.week1 -DartifactId=myApp -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

3. Push the branch to Github
```bash
git push -u origin week1
```

4. Added the JenkinsFile to location myApp/misc/JenkinsFile
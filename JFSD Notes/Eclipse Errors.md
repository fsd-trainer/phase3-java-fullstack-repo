ArtifactTransferException: org.apache.maven.plugins:maven-resources-plugin:pom:3.2.0 failed to transfer from https://repo.maven.apache.org/maven2 during a previous attempt. This failure was cached in the local repository and resolution is not reattempted until the update interval of central has elapsed or updates are forced. Original error: Could not transfer artifact org.apache.maven.plugins:maven-resources-plugin:pom:3.2.0 from/to central (https://repo.maven.apache.org/maven2): The operation was cancelled.
java.lang.reflect.InvocationTargetException

Solution

0. close the eclipse first and then perform these steps:

1. Locate the {user}/.m2/repository (Using Juno /Win7 here)
2. In the Search field in upper right of window, type ".lastupdated". Windows will look through all subfolders for these files in the directory. (I did not look through cache.)
3. Remove them by Right-click > Delete (I kept all of the lastupdated.properties).

4. Start the eclipse and try to import spring boot project using File > Import > Click Browse and select project 

 Check if you see pom.xml 

 5. Click next

 6. Finish to import project in eclipse

==========================================================

web.xml file error for Maven web project in Eclipse





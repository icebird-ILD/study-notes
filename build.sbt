val sbtBuild = SbtBuild("com.logicovercode", "study-notes", "0.0.1")

val studyNotesProject = ( project in file(".") ).settings( sbtBuild.settings )
#SBT Scala example

For issue-
https://github.com/renovatebot/renovate/issues/11212

It create PR like
renovate: Update all non-major dependencies

Package	     Type	 Update	 Change
mozilla/sbt	 docker	 patch	 8u232_1.4.9 -> 8u292_1.5.4

Issue - Update missed by renovate
For above change it should update build.properties

Expected PR Should raise for below change
sbt.version = 1.4.5 to sbt.version = 1.5.4


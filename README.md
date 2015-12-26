# SBTSample
使用SBT脚本更新本地Nexus仓库！
#SBT repositories
设置~/.sbt/repositories
```
[repositories]
	local
	nexus:http://localhost:8081/nexus/content/groups/public/
	nexus-ivy:http://localhost:8081/nexus/content/groups/public/, [organization]/[module]/(scala_[scalaVersion]/)(sbt_[sbtVersion]/)[revision]/[type]s/[artifact](-[classifier]).[ext] 
#	oschina:http://maven.oschina.net/content/groups/public/ 
#	oschina-ivy:http://maven.oschina.net/content/groups/public/, [organization]/[module]/(scala_[scalaVersion]/)(sbt_[sbtVersion]/)[revision]/[type]s/[artifact](-[classifier]).[ext] 
```

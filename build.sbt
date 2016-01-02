name := "hello"
organization := "com.gscmcc.sbt"
version := "0.1.0"
scalaVersion := "2.11.7"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

val groovy_version = "2.4.5"
val spring_version = "4.2.4.RELEASE"
val spring_security_version = "4.0.3.RELEASE"
val spring_integration_version = "4.2.4.RELEASE"
val spring_batch_version = "3.0.6.RELEASE"
val spring_webflow_version = "2.4.2.RELEASE"
val spring_session_version = "1.0.2.RELEASE"
val hibernate_version = "5.0.6.Final"
val struts_version = "2.3.24.1"
val log4j_version = "2.5"
val hadoop_version = "2.6.3"
val spark_version = "1.5.2"
val hive_version = "1.2.1"
val drools_version = "6.3.0.Final"
val jbpm_version = "6.3.0.Final"
val mule_version = "3.7.0"
val tapestry_version = "5.4.0"
val wicket_version = "7.1.0"
val play_version = "2.4.6"
val seleniumhq_version = "2.48.2"
val infinispan_version = "8.1.0.Final"
val camel_version = "2.16.1"
val jetty_version = "9.3.6.v20151106"
val akka_version = "2.4.1"
val activemq_version = "5.13.0"
val lucene_version = "5.4.0"
val quartz_version = "2.2.2"

libraryDependencies ++= Seq(
    // "org.codehaus.groovy" % "groovy-all" % groovy_version,
    // "org.codehaus.groovy" % "groovy" % groovy_version,
    // "org.codehaus.groovy" % "groovy-sql" % groovy_version,
    // "org.codehaus.groovy" % "groovy-nio" % groovy_version,
    // "org.codehaus.groovy" % "groovy-jsr223" % groovy_version,
    // "org.codehaus.groovy" % "groovy-json" % groovy_version,
    // "org.codehaus.groovy" % "groovy-xml" % groovy_version,
    // "org.codehaus.groovy" % "groovy-templates" % groovy_version,
    // "org.codehaus.groovy" % "groovy-test" % groovy_version,
    // "org.codehaus.groovy" % "groovy-bsf" % groovy_version,
    // "org.codehaus.groovy" % "groovy-jmx" % groovy_version,
    // "org.codehaus.groovy" % "groovy-swing" % groovy_version,
    // "org.codehaus.groovy" % "groovy-servlet" % groovy_version,
    // "org.codehaus.groovy" % "groovy-testng" % groovy_version,
    // "org.codehaus.groovy" % "groovy-groovydoc" % groovy_version,
    // "org.codehaus.groovy" % "groovy-ant" % groovy_version,
    // "org.springframework" % "spring-core" % spring_version,
    // "org.springframework" % "spring-context" % spring_version,
    // "org.springframework" % "spring-beans" % spring_version,
    // "org.springframework" % "spring-jdbc" % spring_version,
    // "org.springframework" % "spring-tx" % spring_version,
    // "org.springframework" % "spring-test" % spring_version,
    // "org.springframework" % "spring-web" % spring_version,
    // "org.springframework" % "spring-webmvc" % spring_version,
    // "org.springframework" % "spring-orm" % spring_version,
    // "org.springframework" % "spring-oxm" % spring_version,
    // "org.springframework" % "spring-instrument" % spring_version,
    // "org.springframework" % "spring-websocket" % spring_version,
    // "org.springframework" % "spring-webmvc-portlet" % spring_version,
    // "org.springframework" % "spring-context-support" % spring_version,
    // "org.springframework" % "spring-expression" % spring_version,
    // "org.springframework" % "spring-aspects" % spring_version,
    // "org.springframework" % "spring-instrument" % spring_version,
    // "org.springframework.security" % "spring-security-core" % spring_security_version,
    // "org.springframework.security" % "spring-security-cas" % spring_security_version,
    // "org.springframework.security" % "spring-security-acl" % spring_security_version,
    // "org.springframework.security" % "spring-security-taglibs" % spring_security_version,
    // "org.springframework.security" % "spring-security-web" % spring_security_version,
    // "org.springframework.security" % "spring-security-messaging" % spring_security_version,
    // "org.springframework.security" % "spring-security-remoting" % spring_security_version,
    // "org.springframework.security" % "spring-security-data" % spring_security_version,
    // "org.springframework.security" % "spring-security-config" % spring_security_version,
    // "org.springframework.security" % "spring-security-crypto" % spring_security_version,
    // "org.springframework.security" % "spring-security-openid" % spring_security_version,
    // "org.springframework.security" % "spring-security-aspects" % spring_security_version,
    // "org.springframework.security" % "spring-security-ldap" % spring_security_version,
    // "org.springframework.integration" % "spring-integration-core" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-test" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-mail" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-jmx" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-file" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-amqp" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-jms" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-stream" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-http" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-ip" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-event" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-jdbc" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-ws" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-ftp" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-xml" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-redis" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-groovy" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-sftp" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-scripting" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-mongodb" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-jpa" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-rmi" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-zookeeper" % spring_integration_version,
    // "org.springframework.integration" % "spring-integration-websocket" % spring_integration_version,
    // "org.springframework.batch" % "spring-batch-core" % spring_batch_version,
    // "org.springframework.batch" % "spring-batch-infrastructure" % spring_batch_version,
    // "org.springframework.batch" % "spring-batch-test" % spring_batch_version,
    // "org.springframework.batch" % "spring-batch-integration" % spring_batch_version,
    // "org.springframework.webflow" % "spring-webflow" % spring_webflow_version,
    // "org.springframework.webflow" % "spring-binding" % spring_webflow_version,
    // "org.springframework.webflow" % "spring-js" % spring_webflow_version,
    // "org.springframework.webflow" % "spring-faces" % spring_webflow_version,
    // "org.springframework.webflow" % "spring-js-resources" % spring_webflow_version,
    // "org.springframework.session" % "spring-session" % spring_session_version,
    // "org.springframework.session" % "spring-session-data-redis" % spring_session_version,
    // "org.hibernate" % "hibernate-core" % hibernate_version,
    // "org.hibernate" % "hibernate-entitymanager" % hibernate_version,
    // "org.hibernate" % "hibernate-validator" % "5.2.2.Final",
    // "org.hibernate" % "hibernate-search-orm" % "5.5.2.Final",
    // "org.apache.struts" % "struts2-core" % struts_version,
    // "org.apache.struts" % "struts2-cdi-plugin" % struts_version,
    // "org.apache.struts" % "struts2-spring-plugin" % struts_version,
    // "org.apache.struts" % "struts2-convention-plugin" % struts_version,
    // "org.apache.struts" % "struts2-javatemplates-plugin" % struts_version,
    // "org.apache.struts" % "struts2-json-plugin" % struts_version,
    // "org.apache.struts" % "struts2-tiles3-plugin" % struts_version,
    // "org.apache.struts" % "struts2-rest-plugin" % struts_version,
    // "org.apache.struts" % "struts2-sitegraph-plugin" % struts_version,
    // "org.apache.struts" % "struts2-sitemesh-plugin" % struts_version,
    // "org.apache.struts" % "struts2-testng-plugin" % struts_version,
    // "org.apache.struts" % "struts2-junit-plugin" % struts_version,
    // "org.apache.struts" % "struts2-portlet-plugin" % struts_version,
    // "org.apache.struts" % "struts2-portlet-tiles-plugin" % struts_version,
    // "org.apache.struts" % "struts2-tiles-plugin" % struts_version,
    // "org.apache.struts" % "struts2-java8-support-plugin" % struts_version,
    // "org.apache.struts" % "struts2-embeddedjsp-plugin" % struts_version,
    // "org.apache.struts" % "struts2-jasperreports-plugin" % struts_version,
    // "org.apache.struts" % "struts2-config-browser-plugin" % struts_version,
    // "org.apache.struts" % "struts2-jfreechart-plugin" % struts_version,
    // "org.apache.logging.log4j" % "log4j-core" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-api" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-jcl" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-jul" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-web" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-1.2-api" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-to-slf4j" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-flume-ng" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-nosql" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-flume-ng" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-bom" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-iostreams" % log4j_version,
    // "org.apache.logging.log4j" % "log4j-liquibase" % log4j_version,
    // "org.apache.hive" % "hive-cli" % hive_version,
    // "org.apache.hive" % "hive-exec" % hive_version,
    // "org.apache.hive" % "hive-jdbc" % hive_version,
    // "org.apache.hadoop" % "hadoop-common" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-client" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-hdfs" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-yarn-common" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-yarn-api" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-yarn-client" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-mapreduce-client-core" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-mapreduce-client-jobclient" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-mapreduce-client-common" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-mapreduce-client-app" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-mapreduce-client-hs" % hadoop_version,
    // "org.apache.hadoop" % "hadoop-streaming" % hadoop_version,
    // "org.apache.spark" %% "spark-core" % spark_version,
    // "org.apache.spark" %% "spark-sql" % spark_version,
    // "org.apache.spark" %% "spark-streaming" % spark_version,
    // "org.apache.spark" %% "spark-hive" % spark_version,
    // "org.apache.spark" %% "spark-mllib" % spark_version,
    // "org.apache.spark" %% "spark-catalyst" % spark_version,
    // // // // "org.scala-lang" % "scala-library" % "2.11.7",
    // // // // "org.scala-lang" % "scala-reflect" % "2.11.7",
    // // // // "org.scala-lang" % "scala-compiler" % "2.11.7",
    // // // // "org.scala-lang" % "scalap" % "2.11.7",
    // // // // "org.scala-lang" % "scala-actors" % "2.11.7",
    // // // // "org.scala-lang" % "scala-library-all" % "2.11.7",
    // "org.apache.tapestry" % "tapestry-core" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-ioc" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-hibernate" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-beanvalidator" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-spring" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-jpa" % tapestry_version,
    // "org.apache.tapestry" % "tapestry5-annotations" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-func" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-webresources" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-runner" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-mongodb" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-clojure" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-kaptcha" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-ioc-jcache" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-jmx" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-hibernate-core" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-upload" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-json" % tapestry_version,
    // "org.apache.tapestry" % "tapestry-test" % tapestry_version,
    // "org.apache.wicket" % "wicket-core" % wicket_version,
    // "org.apache.wicket" % "wicket-spring" % wicket_version,
    // "org.apache.wicket" % "wicket-auth-roles" % wicket_version,
    // "org.apache.wicket" % "wicket-bean-validation" % wicket_version,
    // "org.apache.wicket" % "wicket-cdi-1.1" % wicket_version,
    // "org.apache.wicket" % "wicket-datetime" % wicket_version,
    // "org.apache.wicket" % "wicket-devutils" % wicket_version,
    // "org.apache.wicket" % "wicket-extensions" % wicket_version,
    // "org.apache.wicket" % "wicket-guice" % wicket_version,
    // "org.apache.wicket" % "wicket-jmx" % wicket_version,
    // "org.apache.wicket" % "wicket-velocity" % wicket_version,
    // "org.apache.wicket" % "wicket-request" % wicket_version,
    // "org.apache.wicket" % "wicket-util" % wicket_version,
    // "com.typesafe.play" % "play-exceptions" % play_version,
    // "com.typesafe.play" %% "filters-helpers" % play_version,
    // "com.typesafe.play" %% "play" % play_version,
    // "com.typesafe.play" %% "play-cache" % play_version,
    // "com.typesafe.play" %% "play-iteratees" % play_version,
    // "com.typesafe.play" %% "play-java" % play_version,
    // "com.typesafe.play" %% "play-java-jdbc" % play_version,
    // "com.typesafe.play" %% "play-java-jpa" % play_version,
    // "com.typesafe.play" %% "play-java-ws" % play_version,
    // "com.typesafe.play" %% "play-jdbc" % play_version,
    // "com.typesafe.play" %% "play-jdbc-api" % play_version,
    // "com.typesafe.play" %% "play-jdbc-evolutions" % play_version,
    // "com.typesafe.play" %% "play-json" % play_version,
    // "com.typesafe.play" %% "play-netty-server" % play_version,
    // "com.typesafe.play" %% "play-server" % play_version,
    // "com.typesafe.play" %% "play-test" % play_version,
    // "com.typesafe.play" %% "play-ws" % play_version,
    // "com.typesafe.play" %% "run-support" % play_version,
    // "org.seleniumhq.selenium" % "selenium-java" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-firefox-driver" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-server" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-remote-driver" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-chrome-driver" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-ie-driver" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-safari-driver" % seleniumhq_version,
    // "org.seleniumhq.selenium" % "selenium-support" % seleniumhq_version,
    "com.typesafe.akka" %% "akka-actor" % akka_version,
    "com.typesafe.akka" %% "akka-slf4j" % akka_version,
    "com.typesafe.akka" %% "akka-testkit" % akka_version,
    "com.typesafe.akka" %% "akka-cluster" % akka_version,
    "com.typesafe.akka" %% "akka-agent" % akka_version,
    "com.typesafe.akka" %% "akka-persistence" % akka_version,
    "com.typesafe.akka" %% "akka-cluster-tools" % akka_version,
    "com.typesafe.akka" %% "akka-protobuf" % akka_version,
    "com.typesafe.akka" %% "akka-remote" % akka_version,
    "com.typesafe.akka" %% "akka-osgi" % akka_version,
    "com.typesafe.akka" %% "akka-camel" % akka_version,
    "com.typesafe.akka" %% "akka-kernel" % akka_version,
    "org.apache.activemq" % "activemq-client" % activemq_version,
    "org.apache.activemq" % "activemq-client" % activemq_version,
    "org.apache.activemq" % "activemq-all" % activemq_version,
    "org.quartz-scheduler" % "quartz" % quartz_version,
    "org.quartz-scheduler" % "quartz-jobs" % quartz_version,
    "org.apache.lucene" % "lucene-core" % lucene_version,
    "org.apache.lucene" % "lucene-analyzers-common" % lucene_version,
    "org.apache.lucene" % "lucene-queryparser" % lucene_version,
    "org.apache.lucene" % "lucene-queries" % lucene_version,
    "org.apache.lucene" % "lucene-highlighter" % lucene_version,
    "org.drools" % "drools-core" % drools_version,
    "org.drools" % "drools-compiler" % drools_version,
    "org.drools" % "drools-decisiontables" % drools_version,
    "org.drools" % "drools-workbench-models-datamodel-api" % drools_version,
    "org.drools" % "knowledge-api" % drools_version,
    "org.jbpm" % "jbpm-bpmn2" % jbpm_version,
    "org.jbpm" % "jbpm-flow" % jbpm_version,
    "org.jbpm" % "jbpm-human-task-core" % jbpm_version,
    "org.jbpm" % "jbpm-workitems" % jbpm_version,
    "org.jbpm" % "jbpm-persistence-jpa" % jbpm_version,
    "org.jbpm" % "jbpm-kie-services" % jbpm_version,
    "org.jbpm" % "jbpm-flow-builder" % jbpm_version,
    "org.jbpm" % "jbpm-runtime-manager" % jbpm_version,
    "org.jbpm" % "jbpm-audit" % jbpm_version,
    "org.jbpm" % "jbpm-services-api" % jbpm_version,
    "org.jbpm" % "jbpm-human-task-audit" % jbpm_version,
    "org.jbpm" % "jbpm-human-task-jpa" % jbpm_version,
    "org.jbpm" % "jbpm-query-jpa" % jbpm_version,
    // // "org.mule" % "mule-core" % mule_version,
    // // "org.mule.transports" % "mule-transport-vm" % mule_version,
    // // "org.mule.transports" % "mule-transport-http" % mule_version,
    // // "org.mule.transports" % "mule-transport-jms" % mule_version,
    // // "org.mule.transports" % "mule-transport-file" % mule_version,
    // // "org.mule.transports" % "mule-transport-tcp" % mule_version,
    // // "org.mule.transports" % "mule-transport-quartz" % mule_version,
    // // "org.mule.transports" % "mule-transport-email" % mule_version,
    // // "org.mule.transports" % "mule-transport-servlet" % mule_version,
    // // "org.mule.transports" % "mule-transport-jdbc" % mule_version,
    // // "org.mule.transports" % "mule-transport-ftp" % mule_version,
    // // "org.mule.transports" % "mule-transport-sftp" % mule_version,
    // // "org.mule.transports" % "mule-transport-ssl" % mule_version,
    // // "org.mule.transports" % "mule-transport-axis" % mule_version,
    // // "org.mule.transports" % "mule-transport-stdio" % mule_version,
    // // "org.mule.transports" % "mule-transport-jetty" % mule_version,
    // // "org.mule.transports" % "mule-transport-udp" % mule_version,
    // // "org.mule.transports" % "mule-transport-ejb" % mule_version,
    // // "org.mule.transports" % "mule-transport-multicast" % mule_version,
    // // "org.mule.transports" % "mule-transport-ajax" % mule_version,
    // // "org.mule.transports" % "mule-transport-rmi" % mule_version,
    // // "org.mule.transports" % "mule-transport-xmpp" % mule_version,
    // // "org.mule.modules" % "mule-module-client" % mule_version,
    // // "org.mule.modules" % "mule-module-scripting" % mule_version,
    // // "org.mule.modules" % "mule-module-json" % mule_version,
    // // "org.mule.modules" % "mule-module-cxf" % mule_version,
    // // "org.mule.modules" % "mule-module-builders" % mule_version,
    // // "org.mule.modules" % "mule-module-management" % mule_version,
    // // "org.mule.modules" % "mule-module-http" % mule_version,
    // // "org.mule.modules" % "mule-module-db" % mule_version,
    // // "org.mule.modules" % "mule-module-ws" % mule_version,
    "org.infinispan" % "infinispan-core" % infinispan_version,
    "org.infinispan" % "infinispan-client-hotrod" % infinispan_version,
    "org.infinispan" % "infinispan-commons" % infinispan_version,
    "org.infinispan" % "infinispan-commons" % infinispan_version,
    "org.infinispan" % "infinispan-cachestore-leveldb" % infinispan_version,
    "org.infinispan" % "infinispan-cachestore-remote" % infinispan_version,
    "org.infinispan" % "infinispan-query" % infinispan_version,
    "org.infinispan" % "infinispan-jcache" % infinispan_version,
    "org.infinispan" % "infinispan-remote" % infinispan_version,
    "org.apache.camel" % "camel-core" % camel_version,
    "org.apache.camel" % "camel-cxf" % camel_version,
    "org.apache.camel" % "camel-jaxb" % camel_version,
    "org.apache.camel" % "camel-sql" % camel_version,
    "org.apache.camel" % "camel-ftp" % camel_version,
    "org.apache.camel" % "camel-scala" % camel_version,
    "org.apache.camel" % "camel-xmljson" % camel_version,
    "org.apache.camel" % "camel-http4" % camel_version,
    "org.apache.camel" % "camel-stream" % camel_version,
    "org.apache.camel" % "camel-atom" % camel_version,
    "org.apache.camel" % "camel-jmx" % camel_version,
    "org.apache.camel" % "camel-velocity" % camel_version,
    "org.apache.camel" % "camel-jpa" % camel_version,
    "org.apache.camel" % "camel-script" % camel_version,
    "org.apache.camel" % "camel-rss" % camel_version,
    "org.apache.camel" % "camel-catalog" % camel_version,
    "org.apache.camel" % "camel-mongodb" % camel_version,
    "org.apache.camel" % "camel-xmlsecurity" % camel_version,
    "org.apache.camel" % "camel-kafka" % camel_version,
    "org.apache.camel" % "camel-zookeeper" % camel_version,
    "org.apache.camel" % "camel-context" % camel_version,
    "org.apache.camel" % "camel-couchdb" % camel_version,
    "org.apache.camel" % "camel-spring-ws" % camel_version,
    "org.apache.camel" % "camel-aws" % camel_version,
    "org.apache.camel" % "camel-hbase" % camel_version,
    "org.apache.camel" % "camel-hdfs2" % camel_version,
    "org.apache.camel" % "camel-spark-rest" % camel_version,
    "org.apache.camel" % "camel-leveldb" % camel_version,
    "org.apache.camel" % "camel-ahc" % camel_version,
    "org.apache.camel" % "camel-xmpp" % camel_version,
    "org.apache.camel" % "camel-rabbitmq" % camel_version,
    "org.apache.camel" % "camel-spring-integration" % camel_version,
    "org.apache.camel" % "camel-jsch" % camel_version,
    "org.apache.camel" % "camel-jsonpath" % camel_version,
    "org.apache.camel" % "camel-base64" % camel_version,
    "org.apache.camel" % "camel-disruptor" % camel_version,
    "org.apache.camel" % "camel-jclouds" % camel_version,
    "org.apache.camel" % "camel-hdfs" % camel_version,
    "org.apache.camel" % "camel-snmp" % camel_version,
    "org.apache.camel" % "camel-lucene" % camel_version,
    "org.apache.camel" % "camel-apns" % camel_version,
    "org.apache.camel" % "camel-syslog" % camel_version,
    "org.apache.camel" % "camel-ejb" % camel_version,
    "org.apache.camel" % "camel-stringtemplate" % camel_version,
    "org.apache.camel" % "camel-smpp" % camel_version,
    "org.apache.camel" % "camel-weather" % camel_version,
    "org.apache.camel" % "camel-sip" % camel_version,
    "org.apache.camel" % "camel-spring-batch" % camel_version,
    "org.apache.camel" % "camel-rx" % camel_version,
    "org.apache.camel" % "camel-stomp" % camel_version,
    "org.apache.camel" % "camel-cassandraql" % camel_version,
    "org.apache.camel" % "camel-docker" % camel_version,
    "org.apache.camel" % "camel-ognl" % camel_version,
    "org.apache.camel" % "camel-freemarker" % camel_version,
    "org.apache.camel" % "camel-xmlbeans" % camel_version,
    "org.apache.camel" % "camel-protobuf" % camel_version,
    "org.apache.camel" % "camel-spring-security" % camel_version,
    "org.apache.camel" % "camel-ssh" % camel_version,
    "org.apache.camel" % "camel-mqtt" % camel_version,
    "org.apache.camel" % "camel-cxf-transport" % camel_version,
    "org.apache.camel" % "camel-xstream" % camel_version,
    "org.apache.camel" % "camel-servlet" % camel_version,
    "org.apache.camel" % "camel-groovy" % camel_version,
    "org.apache.camel" % "camel-cdi" % camel_version,
    "org.apache.camel" % "camel-jackson" % camel_version,
    "org.apache.camel" % "camel-jetty" % camel_version,
    "org.apache.camel" % "camel-test" % camel_version,
    "org.apache.camel" % "camel-spring" % camel_version,
    "org.apache.camel" % "camel-test-spring" % camel_version,
    "org.apache.camel" % "camel-jaxb" % camel_version,
    "org.apache.camel" % "camel-spring-javaconfig" % camel_version,
    "org.apache.camel" % "camel-quartz2" % camel_version,
    "org.apache.camel" % "camel-ibatis" % camel_version,
    "org.apache.camel" % "camel-guice" % camel_version,
    "org.apache.camel" % "camel-shiro" % camel_version,
    "org.apache.camel" % "camel-soap" % camel_version,
    "org.apache.camel" % "camel-zipfile" % camel_version,
    "org.apache.camel" % "camel-bam" % camel_version,
    "org.apache.camel" % "camel-servletlistener" % camel_version,
    "org.apache.camel" % "camel-cache" % camel_version,
    "org.apache.camel" % "camel-solr" % camel_version,
    "org.apache.camel" % "camel-stax" % camel_version,
    "org.apache.camel" % "camel-cassandraql" % camel_version,
    "org.apache.camel" % "camel-infinispan" % camel_version,
    "org.apache.camel" % "camel-dns" % camel_version,
    "org.apache.camel" % "camel-ahc-ws" % camel_version,
    "org.apache.camel" % "camel-xmlrpc" % camel_version,
    "org.apache.camel" % "camel-package-maven-plugin" % camel_version,
    "org.apache.camel" % "camel-performance" % camel_version,
    "org.apache.camel" % "camel-rx" % camel_version,
    "org.eclipse.jetty" % "jetty-server" % jetty_version,
    "org.eclipse.jetty" % "jetty-client" % jetty_version,
    "org.eclipse.jetty" % "jetty-servlet" % jetty_version,
    "org.eclipse.jetty" % "jetty-webapp" % jetty_version,
    "org.eclipse.jetty" % "jetty-servlets" % jetty_version,
    "org.eclipse.jetty" % "jetty-http" % jetty_version,
    "org.eclipse.jetty" % "jetty-continuation" % jetty_version,
    "org.eclipse.jetty" % "jetty-io" % jetty_version,
    "org.eclipse.jetty" % "jetty-jmx" % jetty_version,
    "org.springframework.integration" % "spring-integration-flow" % "1.0.0.RELEASE",
    "org.springframework.integration" % "spring-integration-cassandra" % "0.5.0.RELEASE",
    "org.springframework.integration" % "spring-integration-smpp" % "1.0.0.RELEASE",
    "org.springframework.retry" % "spring-retry" % "1.1.2.RELEASE",
    "org.springframework.hateoas" % "spring-hateoas" % "0.19.0.RELEASE",
    "org.springframework.data" % "spring-data-jpa" % "1.9.0.RELEASE",
    "org.springframework.data" % "spring-data-mongodb" % "1.8.0.RELEASE",
    "org.springframework.data" % "spring-data-commons" % "1.11.0.RELEASE",
    "org.springframework.data" % "spring-data-commons-core" % "1.4.1.RELEASE",
    "org.springframework.data" % "spring-data-redis" % "1.6.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-rest-webmvc" % "2.4.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j" % "4.0.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-core" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-yarn-boot" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-solr" % "1.5.0.RELEASE",
    "org.springframework.data" % "spring-data-elasticsearch" % "1.3.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-store" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-yarn-core" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j-aspects" % "3.4.0.RELEASE",
    "org.springframework.data" % "spring-data-rest-core" % "2.4.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j-rest" % "3.4.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-batch" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-cassandra" % "1.3.0.RELEASE",
    "org.springframework.data" % "spring-data-mongodb-cross-store" % "1.8.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j-tx" % "3.4.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j-tx" % "3.4.0.RELEASE",
    "org.springframework.data" % "spring-data-jdbc-core" % "1.1.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-hive" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-yarn-integration" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-test" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-hbase" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-hadoop-pig" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-cql" % "1.3.0.RELEASE",
    "org.springframework.data" % "spring-data-rest-hal-browser" % "2.4.0.RELEASE",
    "org.springframework.data" % "spring-yarn-boot-cli" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-oracle" % "1.1.0.RELEASE",
    "org.springframework.data" % "spring-yarn" % "2.2.0.RELEASE",
    "org.springframework.data" % "spring-data-keyvalue" % "1.0.0.RELEASE",
    "org.springframework.data" % "spring-data-couchbase" % "1.4.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j-cross-store" % "3.4.0.RELEASE",
    "org.iq80.leveldb" % "leveldb-api" % "0.7",
    "org.iq80.leveldb" % "leveldb" % "0.7",
    "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "ch.qos.logback" % "logback-core" % "1.1.3",
    "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.2",
    "com.google.code.gson" % "gson" % "2.5",
    "com.google.inject" % "guice" % "4.0",
    "com.h2database" % "h2" % "1.4.190",
    "com.itextpdf" % "itextpdf" % "5.5.8",
    "com.jcraft" % "jsch" % "0.1.53",
    "com.lmax" % "disruptor" % "3.3.2",
    "com.mchange" % "c3p0" % "0.9.5.2",
    "com.sun.mail" % "javax.mail" % "1.5.5",
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "com.yahoo.platform.yui" % "yuicompressor" % "2.4.8",
    "commons-cli" % "commons-cli" % "1.3.1",
    "commons-codec" % "commons-codec" % "1.10",
    "commons-io" % "commons-io" % "2.4",
    "commons-net" % "commons-net" % "3.3",
    "io.reactivex" % "rxjava" % "1.0.14",
    "javax.mail" % "javax.mail-api" % "1.5.4",
    "jline" % "jline" % "2.13",
    "joda-time" % "joda-time" % "2.8.2",
    "junit" % "junit" % "4.12",
    "mysql" % "mysql-connector-java" % "5.1.38",
    "net.sf.ehcache" % "ehcache-core" % "2.6.11",
    "net.sf.ehcache" % "ehcache" % "2.10.1",
    "net.sf.json-lib" % "json-lib" % "2.4" classifier "jdk15",
    "org.apache.activemq" % "activemq-client" % activemq_version,
    "org.apache.cassandra" % "cassandra-all" % "3.1",
    "org.apache.commons" % "commons-dbcp2" % "2.1.1",
    "org.apache.commons" % "commons-email" % "1.4",
    "org.apache.commons" % "commons-exec" % "1.3",
    "org.apache.commons" % "commons-lang3" % "3.4",
    "org.apache.commons" % "commons-math3" % "3.5",
    "org.apache.commons" % "commons-pool2" % "2.4.2",
    "org.apache.derby" % "derby" % "10.11.1.1",
    "org.apache.hbase" % "hbase-client" % "1.1.2",
    "org.apache.httpcomponents" % "httpclient" % "4.5.1",
    "org.apache.httpcomponents" % "httpmime" % "4.5.1",
    "org.apache.kafka" % "kafka-clients" % "0.9.0.0",
    "org.apache.kafka" %% "kafka" % "0.9.0.0",
    "org.apache.pig" % "pig" % "0.15.0",
    "org.apache.thrift" % "libthrift" % "0.9.3",
    "org.apache.velocity" % "velocity" % "1.7",
    "org.apache.zookeeper" % "zookeeper" % "3.4.7",
    "org.clojure" % "clojure" % "1.7.0",
    "org.easymock" % "easymock" % "3.4",
    "org.freemarker" % "freemarker" % "2.3.23",
    "org.hbase" % "asynchbase" % "1.7.0",
    "org.hsqldb" % "hsqldb" % "2.3.3",
    "org.jfree" % "jfreechart" % "1.0.19",
    "org.jmock" % "jmock" % "2.8.1",
    "org.joda" % "joda-convert" % "1.8.1",
    "org.jruby" % "jruby-complete" % "9.0.4.0",
    "org.json" % "json" % "20150729",
    "org.mockito" % "mockito-all" % "2.0.2-beta",
    "org.mozilla" % "rhino" % "1.7.7",
    "org.python" % "jython" % "2.7.0",
    "org.slf4j" % "slf4j-api" % "1.7.13",
    "org.squeryl" %% "squeryl" % "0.9.5-7",
    "org.testng" % "testng" % "6.9.10",
    "oro" % "oro" % "2.0.8",
    "redis.clients" % "jedis" % "2.8.0"
)

excludeDependencies += "com.github.stephenc.eaio-grabbag"
excludeDependencies += "org.pentaho"
excludeDependencies += "net.minidev" % "json-smart"

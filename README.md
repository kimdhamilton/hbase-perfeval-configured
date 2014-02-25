to build:
	mvn clean package

to run:
	sudo su - hdfs
	export HBASE_CLASSPATH=./hbase-perfeval-configured-0.0.1-SNAPSHOT.jar
	/usr/lib/hbase/bin/hbase perfeval.PerfEvalLauncher -Dmapred.task.timeout=1800000 sequentialRead 2
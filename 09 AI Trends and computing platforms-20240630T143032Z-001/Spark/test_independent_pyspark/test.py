#!/usr/bin/python

from pyspark.sql import SparkSession
spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().getOrCreate()

# On yarn:
# spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().master("yarn").getOrCreate()
# specify .master("yarn")

sc = spark.sparkContext

file_path = "file:////home/talentum/test-jupyter/P2/M2/SM4/Dataset/constitution.txt"

print("Here is the output")
print(sc.textFile(file_path) \
.flatMap(lambda line: line.split(' ')) \
.map(lambda word: (word, 1)) \
.reduceByKey(lambda x, y: x + y) \
.map(lambda x: (x[1], x[0])) \
.sortByKey(ascending=False).take(10))


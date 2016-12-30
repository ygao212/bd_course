package com.metis.bigdata

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object FirstSparkApp {
  def main(args: Array[String]) = {

    // Setup Spark Configuration
    val sconf = new SparkConf().setAppName("FirstSparkApp")

    // Create Spark Context
    val sc = new SparkContext(sconf)

    // parse input arguments
    val filename = args(0)

    // Create RDD -- load distributed data set
    val lines = sc.textFile(filename)

    // Perform distributed computations
    println("First line = " + lines.first)
    println("#lines = " + lines.count)

    val sparkLines = lines.filter(l => l.toLowerCase.contains("spark"))
    println("#lines with spark word = " + sparkLines.count)

                                  
    sc.stop()
  }
}



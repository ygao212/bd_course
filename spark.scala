import org.apache.spark.sql.types._
val pop = spark.read.option("inferSchema","true").csv("population.csv")
pop.printSchema
pop.show(50)
val popRenamed = pop.toDF("SUMLEV", "REGION", "DIVISION", "STATE", "NAME", "POPESTIMATE2014", "POPEST18PLUS2014", "PCNT_POPEST18PLUS")
val popOneCol = popRenamed.withColumnRenamed("POPEST18PLUS2014","POPULATION")
val popRenamed = pop.toDF("SUMLEV", "REGION", "DIVISION", "STATE", "NAME", "POPESTIMATE2014", "POPEST18PLUS2014", "PCNT_POPEST18PLU")
popRenamed.select("NAME","POPESTIMATE2014").show
popRenamed.selectExpr("NAME as STATE","POPESTIMATE2014/1000 as POP_PER_THOU").show
popRenamed.filter("NAME == \"Montana\"").show
popRenamed.where($"NAME".contains("M")).show
val land = spark.read.csv("us-states-land.csv").toDF("State","Rank","square_miles","percent_water")
val joinedTable = popRenamed.join(land,popRenamed("NAME") === land("State")).show(3)     

popRenamed.createOrReplaceTempView("popTbl")
land.createOrReplaceTempView("landTbl")
val bla = spark.sql("SELECT * FROM landTbl INNER JOIN popTbl ON  (popTbl.Name == landTbl.State)")
bla.show
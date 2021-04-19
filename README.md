# bazel_guice
build and run the test  
bazel build //src/test/java/com/haowei/guice/mysql:db_test  
bazel test //src/test/java/com/haowei/guice/mysql:db_test  
  
you can see the result in bazel_guice/bazel-testlogs/src/test/java/com/haowei/guice/mysql/db_test/test.log  
  
But since I use MYSQL, you have to create your own database on your local PC. So, I will attach my MYSQL database and test.log file for your reference.  

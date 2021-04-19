package(default_visibility = ["//visibility:public"])

java_library(
    name = "dbmodule",
    srcs = ["DbModule.java"],
    deps = ["//:java_test_deps"],
    resources = ["//src/main/resources/META-INF:persistence"],
)

java_library(
    name = "user",
    srcs = ["User.java"],
    deps = ["//:java_test_deps"],
)

java_library(
    name = "user_service",
    srcs = ["UserService.java"],
    deps = [
        ":user", 
        ":dbmodule",
        "//:java_test_deps",
    ],
)